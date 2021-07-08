package com.gzl.testng;

import org.testng.annotations.Test;

public class ErreoClas {
    /**
     *本类是异常测试
     * 什么时候会用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如：传入不合法的参数，程序抛出异常
     * 预期结果就想得到异常
     */
//测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTime(){
        System.out.print("这是一个失败的异常测试");
    }
//成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTime2(){
        System.out.print("这是w的异常测试");
        throw new RuntimeException();

    }
}
