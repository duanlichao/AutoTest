package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider ="data")
    public void testDataProvide(String name,int age){
        System.out.println("name:"+name+",  age:"+age);
    }
    @DataProvider(name = "data")
    public Object[][] provider(){
        Object[][] object=new Object[][]{
                {"jackie",18},
                {"liming",19},
                {"wangwu",20}
        };
        return object;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("method1  name:"+name+",age:"+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("method2  name:"+name+",age:"+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",11},
                    {"lihong",12}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"hongse",21},
                    {"baise",22}
            };
        }
        return result;
    }

}
