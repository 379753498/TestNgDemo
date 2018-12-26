package com.example.testng.Annotation.FactoryAnnotation;

import org.testng.annotations.Factory;

/**
 * 运行Factory 模式可以一次创建N个对象的连续测试
 * 运行Factory 类会运行testNgFactory类中的所有标注的@Test方法
 * 注意 经测试 一个类中只能有一个@Factory方法会被执行 从上到下顺序
 */
public class FactoryAnnotation {

    @Factory
    public Object[] CreateFactory() {
        Object[] result = new Object[10];
        for (int i = 0; i < 10; i++) {
            result[i] = new testNgFactory("FactoryAnnotation");
        }

        return result;
    }
}
