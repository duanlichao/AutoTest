package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println("thread id:  "+Thread.currentThread().getId());
    }
}
