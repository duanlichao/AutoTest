package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("case1");
    }
    @BeforeMethod
    public void beforeCase1(){
        System.out.println("testCase1方法之前执行");
    }
    @AfterMethod
    public void afterCase1(){
        System.out.println("testCase1方法之后执行");
    }
    @Test
    public void testCase2(){
        System.out.println("case2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("类之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类之后运行");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit套件");
    }
}
