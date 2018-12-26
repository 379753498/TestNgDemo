package com.example.testng.Annotation.FactoryAnnotation;

import org.testng.annotations.Test;

public class testNgFactory {
    private String message;

    testNgFactory(String message) {
        this.message = message;
    }

    @Test
    public void firstTest() {
        System.out.println(message + System.currentTimeMillis() + "firstTest");
    }


    @Test
    public void firstTest2() {
        System.out.println(message + System.currentTimeMillis() + "firstTest2");
    }
}
