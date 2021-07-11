package com.gzl.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    //成功
    @Test(timeOut = 3000)//单位毫秒值
    public void testout() throws InterruptedException {
        Thread.sleep(2000);
    }
    //失败
    @Test(timeOut = 2000)
    public void testout2() throws InterruptedException {
        Thread.sleep(3000);

    }
}
