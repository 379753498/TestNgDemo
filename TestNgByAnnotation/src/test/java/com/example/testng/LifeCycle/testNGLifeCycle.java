package com.example.testng.LifeCycle;

import org.testng.annotations.*;

public class testNGLifeCycle {


    @BeforeSuite()
    public void BeforeSuite() {
        System.out.println("@BeforeSuite该套件的所有测试都运行在注释的方法之前，仅运行一次");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("@BeforeTest 在测试之前执行  只运行一次 ");
    }


    @BeforeClass
    public void BeforeClass() {
        System.out.println("@BeforeClass 调用该类第一个测试方法之前运行 只运行一次");
    }


    @AfterClass
    public void AfterClass() {
        System.out.println("@AfterClass 调用该类最后一个测试方法之后运行 只运行一次");
    }


    @AfterTest
    public void AfterTest() {
        System.out.println("@AfterTest 调用该类的最后一个方法之后执行只运行一次");
    }


    @AfterSuite
    public void AfterSuite() {
        System.out.println("@AfterSuite 该套件的所有测试都运行在注释的方法之后，仅运行一次");
    }


    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("@BeforeMethod 每个测试方法执行之前会执行该方法 会执行多次");

    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("@AfterMethod 每个测试方法执行之后会执行该方法 会执行多次");

    }

    @AfterGroups("group1")
    public void AfterGroups() {
        System.out.println("@AfterGroups  此方法在对应的Group测试用例执行后 进行执行 会执行多次");
    }

    @BeforeGroups("group1")
    public void BeforeGroups() {
        System.out.println("@BeforeGroups  此方法在对应的Group测试用例执行前进行执行 会执行多次");
    }

    @Test(groups = "group1")
    public void testN0() {

        System.out.println("this  is  ListenerAnnotationTest 6666666666666");
    }


}
