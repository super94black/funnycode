package org.redrock.share.service;


import org.redrock.share.util.Result;

import java.io.IOException;

/**
 * @Author zhang
 * @Date 2017/9/27 20:08
 * @Content
 */
public interface SpiderService {
    public void getClassTableFromJwzx() throws IOException, InterruptedException;
    public void spiderClass();
    public void getStuNumByClassNum();
    public void downLoadPic();
}
