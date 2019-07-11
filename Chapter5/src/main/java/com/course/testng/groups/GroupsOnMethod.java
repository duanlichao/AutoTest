package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("server1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("client2");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("server前运行");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("client前运行");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("server后运行");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("client后运行");
    }
}
