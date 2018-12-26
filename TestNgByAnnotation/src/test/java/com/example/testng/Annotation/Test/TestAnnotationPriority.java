package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * priority	此测试方法的优先级。将优先安排较低的优先事项。
 * 默认值=0 数字越大执行顺序越靠后
 */
public class TestAnnotationPriority {
    @Test(priority = 0)
    public void Testpriority() {
        System.out.println("Testpriority");
    }

    @Test(priority = 1)
    public void Testpriority1() {
        System.out.println("Testpriority1");
    }

    @Test(priority = 2)
    public void Testpriority2() {
        System.out.println("Testpriority2");
    }
}





