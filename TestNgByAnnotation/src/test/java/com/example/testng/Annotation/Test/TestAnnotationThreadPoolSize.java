package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * threadPoolSize
 * 此方法的线程池大小。该方法将从invocationCount指定的多个线程调用。 注意：如果未指定invocationCount，则忽略此属性
 * 如果方法的执行顺序不影响结果可以使用线程池来执行
 */
public class TestAnnotationThreadPoolSize {

    int i = 0;

    @Test(threadPoolSize = 10, invocationCount = 20)
    public void TestthreadPoolSize() {
        i++;
        System.out.println(i);

    }

    @Test(threadPoolSize = 0, invocationCount = 20)
    public void TestthreadPoolSize1() {
        i++;
        System.out.println(i);

    }


}
