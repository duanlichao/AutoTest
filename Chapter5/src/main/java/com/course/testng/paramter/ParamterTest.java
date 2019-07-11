package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"age","name"})
    public void test(int age,String name){
        System.out.println("name="+name+",age="+age);
    }
}
