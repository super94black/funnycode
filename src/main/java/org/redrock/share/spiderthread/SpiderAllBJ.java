package org.redrock.share.spiderthread;

import org.redrock.share.service.SpiderService;
import org.redrock.share.service.impl.SpiderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * @Author zhang
 * @Date 2017/10/30 20:18
 * @Content 爬取所有班级的线程
 */

public class SpiderAllBJ extends Thread{

    private SpiderService sp = new SpiderServiceImpl();
    @Override
    public void run() {
        sp.spiderClass();
    }
}
