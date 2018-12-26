package com.example.testng.Annotation.DataProvider;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 操作要点 1、Static 方法
 * 2、参数Name要填写
 * 3、返回值 只能Iterator <Object[]> 或者 Object[][]
 * 4、推荐Iterator <Object[]> 编写代码效率高点
 * name：此数据提供者的名称。如果未提供，则此数据提供程序的名称将自动设置为方法的名称。
 * parallel：如果设置为true，则使用此数据提供程序生成的测试将并行运行。默认值为false。
 */
public class dataProviderAnnotation {


    /**
     * The annotated method must return an Iterator<Object[]> where each
     *
     * @return
     */
    @DataProvider(name = "dataProviderIterator")
    public static Iterator <Object[]> dataProviderIterator() {
        List <Object> ListString = new ArrayList <>();
        ListString.add("小明0");
        ListString.add("小明1");
        ListString.add("小明2");
        ListString.add("小明3");
        ListString.add("小明4");
        Iterator <Object[]> iterator = dataProviderAnnotation.ObjectLisToIterator(ListString);
        return iterator;
    }

    /**
     * The annotated method must return an Object[][] where each
     *
     * @return
     */
    @DataProvider(name = "dataProviderObject")
    public static Object[][] dataProviderObject() {

        return new Object[][]{
                {"小明", 18, "文艺青年"},
                {"小红", 19, "屌丝青年"},
                {"小黄", 20, "二逼青年"},
        };

    }


    /**
     * @param list 将一个对象List 转化成Iterator<Object[]>
     * @return
     */
    public static Iterator <Object[]> ObjectLisToIterator(List <Object> list) {
        List <Object[]> objects = new ArrayList <Object[]>();
        for (Object object : list) {
            objects.add(new Object[]{object});
        }
        return objects.iterator();
    }

}
