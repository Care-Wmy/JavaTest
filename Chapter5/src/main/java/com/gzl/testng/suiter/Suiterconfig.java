package com.gzl.testng.suiter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//所有测试套件配置
public class Suiterconfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("befor suite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("after suite运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.print("beforeTest运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.print("afterTest运行了");
    }

}
