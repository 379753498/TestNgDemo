package com.example.testng.Annotation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * successPercentage	此方法预期的成功百分比
 * 默认是100 也就全部成功
 * 尚未找到用处何在
 */
public class TestAnnotationSuccessPercentage {
    int i = 0;

    @Test(successPercentage = 20, invocationCount = 3)
    public void TestsuccessPercentage() {

        System.out.println("100");
        ++i;
        Assert.assertEquals(i, 2);

    }
}
