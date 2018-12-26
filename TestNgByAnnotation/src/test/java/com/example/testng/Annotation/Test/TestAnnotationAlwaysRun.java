package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * alwaysrun 意思就不论什么情况都要被执行
 * <p>
 * 我们定义2个测试用例
 * wakeUp
 * GotoSchool
 * 为了保证执行顺序 一定是先Wakeup 然后执行Gotoschool
 * 为了演示alwaysRun 强制在Wakeup 报错查看 Gotoschool 是否运行
 */
@Test
public class TestAnnotationAlwaysRun {

    public void wakeUp() {
        int i = 1;
        System.out.println(i / 0);
        throw new RuntimeException("我出现了异常");
    }

    @Test(dependsOnMethods = "wakeUp", alwaysRun = true)
    public void GotoSchool() {
        System.out.println("GotoSchool");
    }
}
