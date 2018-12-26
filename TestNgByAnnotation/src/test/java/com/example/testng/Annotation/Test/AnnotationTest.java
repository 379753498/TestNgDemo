package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * Test作用域 如果标记在类上 那么下面的方法都将默认标记@test
 * 如果类上没有添加注解，方法上标记 那么标记的方法将会被执行
 */
@Test
public class AnnotationTest {


    public void Testone() {
        System.out.println("Testone");
    }

    public void Testtwo() {
        System.out.println("Testtwo");
    }
}
