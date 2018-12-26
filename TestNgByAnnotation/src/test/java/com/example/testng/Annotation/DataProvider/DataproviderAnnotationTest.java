package com.example.testng.Annotation.DataProvider;


import org.testng.annotations.Test;

public class DataproviderAnnotationTest {


    @Test(dataProviderClass = dataProviderAnnotation.class, dataProvider = "dataProviderIterator")
    public void dataProviderIterator(String str) {
        System.out.println(str);
    }

    @Test(dataProviderClass = dataProviderAnnotation.class, dataProvider = "dataProviderObject")
    public void dataProviderIteratorObject(String name, int age, String Type) {
        System.out.println(name + "今年" + age + "岁了，是一个" + Type);
    }

    @Test(dataProviderClass = dataProviderAnnotation.class, dataProvider = "dataProviderObject")
    public void MyITestNGListenerImp(String name, int age, String Type) {
        System.out.println(name + "今年" + age + "岁了，是一个" + Type);
    }


}
