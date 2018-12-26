package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * groups 分组的意思
 * 我们可以将每个用例指定一个组
 * 其中组的顺序我们可以 使用依赖或者优先级来实现顺序
 * 测试用例可以依赖组运行 也可以依赖方法执行
 * 注意：定义在类上的组信息将会传递到每个测试用例中 例如类上定义Groups={"hello"} 那么这个类下的所有测试用例都将拥有该组
 */
public class TestAnnotationGroups {
    @Test(groups = {"workgroup", "hellogroup"})
    public void workgroup() {
        System.out.println("workgroup");
    }

    @Test(groups = {"playgroup"})
    public void playgroup() {
        System.out.println("playgroup");
    }

    @Test(priority = 2, groups = {"playgroup"})
    public void playgroupone() {
        System.out.println("playgroupone");
    }
}
