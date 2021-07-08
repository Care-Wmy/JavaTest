package com.gzl.testng;

import org.testng.annotations.Test;

public class lgnoreTest {
    @Test
    public void ignore1(){
            System.out.print("ignore1 执行");
    }
    //忽略测试 设置enabled为false 为忽略  true不忽略（@Test注解默认不忽略）
    @Test(enabled = false)
    public void ignore2(){
        System.out.print("222zhixing");
    }


}
