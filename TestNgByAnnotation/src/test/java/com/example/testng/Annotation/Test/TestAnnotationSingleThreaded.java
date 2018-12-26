package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * singleThreaded	如果设置为true，则此测试类上的所有方法都保证在同一个线程中运行，
 * 即使当前正在使用parallel =“methods”运行测试。
 * 此属性只能在类级别使用，如果在方法级别使用，它将被忽略。注意：此属性曾被称为顺序（现已弃用）。
 */
@Test(singleThreaded = true)
public class TestAnnotationSingleThreaded {


    public void TestsingleThreaded() {
        System.out.println("TestsingleThreaded");
    }

    public void TestsingleThreaded1() {
        System.out.println("TestsingleThreaded1");
    }
}
