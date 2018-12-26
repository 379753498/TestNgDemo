package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * description	此方法的描述。
 */
public class TestAnnotationdescription {

    @Test(description = "本次测试用例主要是做什么测试")
    public void description() {
        System.out.println("description");
    }

}
