package com.gzl.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDte(String name,int age){

        System.out.print("name=" + name + "age=" + age);
    }

    @DataProvider(name="data")
    public Object[] [] provdata(){
        Object [] [] o = new Object[][]{
                {"小红",10},
                {"小明",20},
                {"小张",80}
        };
        return o;
    }
    @Test(dataProvider = "methoddata")
    public void test1(String name,int age){
        System.out.print("test1方法name=" + name + "；age=" + age);
    }
    @Test(dataProvider = "methoddata")
    public void test2(String name,int age){
        System.out.print("test2方法name=" + name + "；age=" + age);
    }

    @DataProvider(name="methoddata")
    public Object[] [] prdata(Method method) {
        Object[][] re = null;
        if (method.getName().equals("test1")){
            re = new Object[][]{
                    {"许昆旗",50},
                    {"李宏涛",60},
            };
        }else if(method.getName().equals("test2")){
            re = new Object[][]{
                    {"王钟伟",90},
                    {"王嵩",66},
            };
        }
        return re;
    }
}
