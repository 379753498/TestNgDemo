package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * invocationCount	应该调用此方法的次数。
 */
public class TestAnnotationInvocationCount {

    @Test(invocationCount = 3)
    public void TestinvocationCount() {
        System.out.println("TestinvocationCount");
    }
}
