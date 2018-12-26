package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * invocationTimeOut	此测试应对所有调用计数的累计时间应采用的最大毫秒数。如果未指定invocationCount，则将忽略此属性。
 * invocationTimeOut = 5000,invocationCount=3
 * 此方法执行3次的时间不能超过5S
 */
public class TestAnnotationInvocationTimeOut {

    @Test(invocationTimeOut = 5000, invocationCount = 3)
    public void TestinvocationTimeOut() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("hello TestinvocationTimeOut");
    }
}
