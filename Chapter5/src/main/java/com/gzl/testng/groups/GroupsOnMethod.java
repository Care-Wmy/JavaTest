package com.gzl.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.print("这是服务端租测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.print("这是服务端租测试方法2222222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.print("这是服务端租测试方法333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.print("这是服务端租测试方法4444444");
    }
    @BeforeGroups("server")
    public void beforGroupMethod(){
        System.out.print("这是服务端租之前的方法server");
    }
    @AfterGroups("server")
    public void afterGroupMethod(){
        System.out.print("这是服务端租之后的方法client！！！！！！！！");
    }

    @BeforeGroups("client")
    public void beforGrouponclient(){
        System.out.print("这是客户端租之前的方法");
    }
    @AfterGroups("client")
    public void afterGrouponclient(){
        System.out.print("这是客户端端租之后的方法client！！！！！！！！");
    }

}
