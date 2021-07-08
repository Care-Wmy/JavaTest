package com.gzl.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试  标签写法 dependsOnMethods = {"test1"}
 * 当test2依赖test1时 如果test1抛出异常那么 test2将忽略掉不被执行
 *场景：比如操作个人信息    但是必须登录才能操作个人信息
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.print("run  test111111");
        //抛异常
        //throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("run  test2222222");
    }
}
