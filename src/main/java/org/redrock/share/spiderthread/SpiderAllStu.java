package org.redrock.share.spiderthread;

import org.redrock.share.service.SpiderService;
import org.redrock.share.service.impl.SpiderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author zhang
 * @Date 2017/10/30 20:21
 * @Content 爬取所有的学生学号
 */
public class SpiderAllStu extends Thread {

    private SpiderService sp = new SpiderServiceImpl();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            sp.getStuNumByClassNum();
        }
}
