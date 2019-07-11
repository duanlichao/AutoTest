package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.println("thread id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("thread id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("thread id:  "+Thread.currentThread().getId());
    }
}
