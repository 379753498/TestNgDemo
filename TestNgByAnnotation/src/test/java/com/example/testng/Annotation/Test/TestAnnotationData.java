package com.example.testng.Annotation.Test;

import com.example.testng.Annotation.DataProvider.dataProviderAnnotation;
import org.testng.annotations.Test;

/**
 * dataProviderClass=告诉框架 我需要从哪个类获取数据
 * dataProvider= 告诉框架 我需要获取数据的名称是什么
 */
public class TestAnnotationData {

    @Test(dataProviderClass = dataProviderAnnotation.class, dataProvider = "dataProviderObject")
    public void DataProviderTest(String name, int age, String Type) {
        System.out.println(name + "今年" + age + "岁了，是一个" + Type);
    }
}
