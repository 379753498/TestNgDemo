package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * expectedExceptions
 * 预期测试方法抛出的异常列表。如果抛出此列表中没有异常或不同异常，则此测试将标记为失败。
 */
public class TestAnnotationExpectedExceptions {


    @Test(expectedExceptions = Exception.class)
    public void TestexpectedExceptionsOK() throws Exception {
        System.out.println("hello");
        throw new Exception("hhh");
    }

    @Test(expectedExceptions = Exception.class)
    public void TestexpectedExceptions() {
        System.out.println("hello TestexpectedExceptions");
    }
}
