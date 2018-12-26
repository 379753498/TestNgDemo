package com.example.testng.HelloWorld;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

/**
 *
 * 使用编程方式实现用例运行
 */
public class RunTestNgByProgrammatically {

    public static void main(String[] args) {

        TestListenerAdapter tla= new TestListenerAdapter();
        TestNG testng= new TestNG();
        testng.setTestClasses(new Class[]{TestNgHelloWorld.class});
        testng.addListener(tla);
        testng.run();
    }
}
