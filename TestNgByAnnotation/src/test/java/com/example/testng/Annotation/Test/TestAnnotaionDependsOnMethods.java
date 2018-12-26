package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * dependsOnMethods	 此方法所依赖的方法列表。
 * 例子中 声明了 Method、Method1、Method1
 * 其中 Method1 依赖 Method
 * Method2 依赖 Method1
 * 此时执行顺序就是 Method-->Method1--->Method2
 */
public class TestAnnotaionDependsOnMethods {

    @Test(priority = 3)
    public void Method() {
        System.out.println("This is Method");
    }

    @Test(priority = 2, dependsOnMethods = "Method")
    public void Method1() {
        System.out.println("This is Method1");
    }

    @Test(priority = 1, dependsOnMethods = "Method1")
    public void Method2() {
        System.out.println("This is Method2");
    }
}
