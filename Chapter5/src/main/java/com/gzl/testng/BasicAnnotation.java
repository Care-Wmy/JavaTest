package com.gzl.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void  testCase1(){
            System.out.print("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.print("这是测试用例2");
    }
    //@BeforeMethod这是在Test方法之前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("BeforeMethod这是在测试方法之前运行的");
    }
    //@AfterMethod这是在Test方法之后运行
    @AfterMethod
    public void afterMethod(){
        System.out.print("AfterMethod这是测试方法之后运行的");
    }
    //@BeforeClass这是在类运行之前运行的
    @BeforeClass
    public void beforClass(){
        System.out.print("BeforeClass这是在类运行之前运行的");
    }
    //@AfterClass这是在类运行之后运行的
    @AfterClass
    public void afterClass(){
        System.out.print("AfterClass这是在类运行之后运行的");
    }
    //@BeforeSuite在类运行之前运行的
    @BeforeSuite
    public void beforSuite(){
        System.out.print("BeforeSuite测试套件");
    }
    //@AfterSuite在类运行之后运行的
    @AfterSuite
    public void afterSuiter(){
        System.out.print("AfterSuite测试套件");
    }

}
