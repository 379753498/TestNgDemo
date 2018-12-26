package com.example.testng.HelloWorld;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟以套件的形式代码实现方式
 */

public class RunTestNgByProgramXMl {

    public static void main(String[] args) {

        XmlSuite xmlSuite= new XmlSuite();
        xmlSuite.setName("套件名称");
        XmlTest xmlTest = GetXmltest(xmlSuite, "测试名称", "com.example.testng.HelloWorld.TestNgHelloWorld");
        List<XmlSuite> xmlSuiteList= new ArrayList <>();
        xmlSuiteList.add(xmlSuite);
        TestNG testNG= new TestNG();
        testNG.setXmlSuites(xmlSuiteList);
        testNG.run();
    }

    public static XmlTest  GetXmltest(XmlSuite xmlSuite, String testname, String testClass) {
        XmlTest xmlTest = new XmlTest(xmlSuite);
        xmlTest.setName(testname);
        List<XmlClass> listxmlclass = new ArrayList<>();
        listxmlclass.add(new XmlClass(testClass));
        xmlTest.setClasses(listxmlclass);
        return xmlTest;
    }
}
