package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * Enabled 是否启用该测试用例的意思
 */
@Test
public class TestAnnotationEnabled {
    @Test(enabled = false)
    public void wakeUp() {

        System.out.println("wakeUp");
    }

    public void GotoSchool() {
        System.out.println("GotoSchool");
    }
}
