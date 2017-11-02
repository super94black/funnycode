package org.redrock.share.spiderthread;
import org.redrock.share.service.SpiderService;
import org.redrock.share.service.impl.SpiderServiceImpl;
import java.io.IOException;

/**
 * @Author zhang
 * @Date 2017/10/30 20:24
 * @Content 爬取所有的课表
 */

public class SpiderClassTable extends Thread {

    private SpiderService sp = new SpiderServiceImpl();
    @Override
    public void run() {
        while (true){
            try {
                sp.getClassTableFromJwzx();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                return;
            }
        }
    }
}
