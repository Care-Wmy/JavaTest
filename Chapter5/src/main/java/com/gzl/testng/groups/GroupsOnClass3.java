package com.gzl.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.print("GroupsOnClass33333333中的teacher111111111运行");
    }

    public void teacher2(){
        System.out.print("GroupsOnClass333333中的teacher222222运行");
    }

}
