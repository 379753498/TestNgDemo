package com.example.testng.Annotation.Test;

import org.testng.annotations.Test;

/**
 * dependsOnGroups	 此方法所依赖的组列表。
 * 例子中 声明了 Group、Group1、Group2
 * 其中 Group1 依赖 Group
 * Group2 依赖 Group1
 * 此时执行顺序就是 Group-->Group1--->Group2
 */
public class TestAnnotationDependsOnGroups {
    @Test(priority = 3, groups = "Group")
    public void Group() {
        System.out.println("This is group");
    }

    @Test(priority = 2, dependsOnGroups = "Group", groups = "Group1")
    public void Group1() {
        System.out.println("This is group1");
    }

    @Test(priority = 1, dependsOnGroups = "Group1", groups = "Group2")
    public void Group2() {
        System.out.println("This is group2");
    }
}
