package org.redrock.share.service.impl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.redrock.share.common.UrlConst;
import org.redrock.share.component.JedisClient;
import org.redrock.share.dao.ClasstableMapper;
import org.redrock.share.pojo.Classtable;
import org.redrock.share.service.SpiderService;
import org.redrock.share.spiderthread.SpiderAllBJ;
import org.redrock.share.spiderthread.SpiderAllStu;
import org.redrock.share.spiderthread.SpiderClassTable;
import org.redrock.share.spiderthread.SpiderStuImg;
import org.redrock.share.util.HttpsUtil;
import org.redrock.share.util.JsonUtils;
import org.redrock.share.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author zhang
 * @Date 2018/9/26 22:40
 * @Content 爬虫实现类
 */
@Service
public class SpiderServiceImpl implements SpiderService {

    @Autowired
    private ClasstableMapper classtableMapper;
    private JedisClient js = new JedisClient();

    @Test
    public void sprideFromJwzx() throws IOException {
        String url = "http://jwzx.cqupt.congm.in/jwzxtmp/kebiao/kb_stu.php?xh=2015211505";
        Connection con = Jsoup.connect(url);//获取请求连接
        //浏览器可接受的MIME类型。
        //模拟浏览器
        con.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        con.header("Accept-Encoding", "gzip, deflate");
        con.header("Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3");
        con.header("Connection", "keep-alive");
        con.header("Host", "jwzx.cqupt.congm.in");
        con.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:26.0) Gecko/20100101 Firefox/26.0");
//        Document doc = Jsoup.connect(url).get();
        Document doc = con.get();
        ArrayList arrayList = new ArrayList();
        Element table = doc.getElementsByTag("table").get(0);
        if (table == null || table.text() == null) {
            return;
        }
        Elements trs = table.getElementsByTag("tr");
        for (int i = 1; i < trs.size(); i++) {
            Element tr = trs.get(i);
            Elements tds = tr.getElementsByTag("td");
            for (int j = 1; j < tds.size(); j++) {
                ArrayList infoList = new ArrayList();
                Element td = tds.get(j);
                if (td.text().equals("")) {
                    infoList.add("0");
                    arrayList.add(infoList);
                    continue;
                }
                String text = td.text().replace("\n", "");
                text = text.replace(" -", "-");
                String splite[] = text.split("\\s+");
                for (int k = 0; k < splite.length; k++) {
                    //分割课程号和课程名
                    if (splite.length > 8) {
                        if (k % 8 == 0) {
                            //验证
                        }
                        if (k % 8 == 1) {
                            String splitCourse[] = splite[k].split("-");
                            splite[k] = splitCourse[0];
                            String courseName = "";
                            for (int m = 1; m < splitCourse.length; m++)
                                courseName += splitCourse[m];
                            splite[k + 6] = courseName;
                        }
//                        if(k % 8 == 2){
//                            splite[k] = splite[k].split("：")[1];
//                        }
                        infoList.add(splite[k]);
                    }
                }
                arrayList.add(infoList);
            }
        }
        System.out.println(arrayList);
    }

    @Test
    public void getClassTableFromJwzx() throws IOException, InterruptedException {
        ArrayList list = new ArrayList();
        String stuNum = null;
//        synchronized (this){
//            while (js.scard(UrlConst.ALL_STU) == 0){
//                this.wait();
//            }
//            stuNum = js.spop(UrlConst.ALL_STU);
//            list = sprideFromJwzx("2016213623");
//        }

        ArrayList<Classtable> newList = new ArrayList();
        if (list == null || list.size() == 0) {
            Result result = new Result();
            result.setStatus(400);
            result.setInfo("该学号不存在");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] weeks = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
            ArrayList infoList = (ArrayList) list.get(i);
            if (infoList == null || infoList.size() == 0) {
                continue;
            }
            String[] classTime = {"1、2节", "3、4节", "中午间歇", "5、6节", "7、8节", "下午间歇", "9、10节", "11、12节"};
            int classCount = infoList.size() / 8;
            int week = i % 7;
            int jieshu = i / 7;
            for (int j = 0; j < classCount; j++) {
                Classtable table = new Classtable();
                table.setStuNum(stuNum);
                table.setWeek(weeks[week]);
                table.setTermTime("201701");
                table.setJieshu(classTime[jieshu]);
                table.setClassNum((String) infoList.get(8 * j));
                table.setCourseNum((String) infoList.get(8 * j + 1));
                table.setCourseName((String) infoList.get(8 * j + 2));
                table.setLocation((String) infoList.get(8 * j + 3));
                table.setClassTime((String) infoList.get(8 * j + 4));
                table.setTeacher((String) infoList.get(8 * j + 5));
                table.setClassType((String) infoList.get(8 * j + 6));
                table.setCoursePoint((String) infoList.get(8 * j + 7));
                table.setStatus(String.valueOf(1));
                System.out.println(JsonUtils.objectToJson(table));
            }
        }
//        for (Classtable classtable:newList) {
//            classtableMapper.insert(classtable);
//        }

    }

    /**
     * 获取到所有的班级号码
     *
     * @throws IOException
     */
    public void spiderClass(){
        try {
            Document doc = Jsoup.connect(UrlConst.ALL_BJ_URL).get();
            Elements elements = doc.getElementsByTag("a");
            for (Element e : elements) {
                String splite[] = e.text().split("\\(");
                js.sadd(UrlConst.ALL_BJ, splite[0]);
                synchronized (this) {
                    this.notifyAll();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取所有的学生学号
     *
     * @throws InterruptedException
     * @throws IOException
     */
    synchronized public void getStuNumByClassNum() {
        try {
            while (js.scard(UrlConst.ALL_BJ) == 0) {
                this.wait();
            }

            String stuUrl = UrlConst.BJ_STU_URL + js.spop(UrlConst.ALL_BJ);
            Document doc = Jsoup.connect(stuUrl).get();
            Elements elements = doc.getElementsByTag("tr");
            int count = 0;
            for (Element element : elements) {
                //跳过表头
                if (count == 0) {
                    count++;
                    continue;
                }
                //如果该班级没有学生就跳过
                if (element == null || element.text() == null) {
                    continue;
                }
                Elements elements1 = element.getElementsByTag("td");
                for (int i = 0; i < elements1.size(); i++) {
                    if (i == 1) {
                        Element element1 = elements1.get(i);
                        js.sadd(UrlConst.ALL_STU, element1.text());
                        this.notifyAll();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test() {
        try {
            SpiderAllBJ spiderAllBJ = new SpiderAllBJ();
            spiderAllBJ.start();
            for (int i = 0; i < 50; i++) {
                SpiderAllStu spiderAllStu = new SpiderAllStu();
                spiderAllStu.start();
            }
            for (int i = 0; i < 10; i++) {
                SpiderStuImg spiderStuImg = new SpiderStuImg();
                spiderStuImg.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 爬取照片
     */
    synchronized public void downLoadPic() {
        try {
                while (js.scard(UrlConst.ALL_STU) == 0) {
                    this.wait();
                }

                String stuNum = js.spop(UrlConst.ALL_STU);
                String imgUrl = UrlConst.STU_IMG_URL + stuNum;
                URL url = new URL(imgUrl);
                URLConnection conn = url.openConnection();
                conn.setRequestProperty("User-Agent", "Mozilla/4.76");
                conn.setDoOutput(true);
                conn.setConnectTimeout(1000*60*10);
                conn.setReadTimeout(5000);
                conn.connect();
                BufferedInputStream inputStream = new BufferedInputStream(conn.getInputStream());
                String savePath = "img";
                File file = new File(savePath);
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdir();
                }

                String imgName = stuNum + ".jpg";
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(savePath + "\\" + imgName));
                byte buffer[] = new byte[1024];
                int length = 0;
                while ((length = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, length);
                    fileOutputStream.flush();
                }
                inputStream.close();
                fileOutputStream.close();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

