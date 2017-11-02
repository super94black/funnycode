package org.redrock.share.spiderthread;

import org.redrock.share.service.SpiderService;
import org.redrock.share.service.impl.SpiderServiceImpl;

import java.io.IOException;

/**
 * @Author zhang
 * @Date 2017/10/31 20:38
 * @Content
 */
public class SpiderStuImg extends Thread {
    private SpiderService spiderService = new SpiderServiceImpl();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            spiderService.downLoadPic();
        }
    }
}
