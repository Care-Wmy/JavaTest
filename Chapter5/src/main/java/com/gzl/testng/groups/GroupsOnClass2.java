package com.gzl.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.print("GroupsOnClass222222222中的stu1111111111运行");
    }

    public void stu2(){
        System.out.print("GroupsOnClass2222222中的stu222222运行");
    }

}
