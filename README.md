# TestNG文档

## 1-简介

TestNG是一个受JUnit和NUnit启发的测试框架，但引入了一些新功能，使其更强大，更易于使用，例如：

- 注释。
- 在任意大线程池中运行您的测试，并提供各种可用策略（所有方法都在自己的线程中，每个测试类一个线程等等）。
- 测试您的代码是多线程安全的。
- 灵活的测试配置。
- 支持数据驱动的测试（使用`@DataProvider`）。
- 支持参数。
- 强大的执行模型（不再是`TestSuite`）。
- 由各种工具和插件（Eclipse，IDEA，Maven等）支持。
- 嵌入BeanShell以获得更大的灵活性。
- 用于运行时和日志记录的缺省JDK函数（无依赖项）。
- 应用服务器测试的依赖方法。

## 下载依赖TestNG

- 使用了maven做为你的项目管理工具，那么请在Pom.xml中添加以下依赖

```xml
    <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.9.10</version>
            <scope>test</scope>
        </dependency>
	</dependencies>
```

- 如果你使用Gradle

  ```
  repositories {
      jcenter()
  }
   
  dependencies {
      testCompile 'org.testng:testng:6.10'
  }
  
  ```

   

## 安装TestNG运行环境

TestNG作为一个测试框架运用的场景主要有两种

- 使用Idea/Ecplise等工具进行代码的测试由开发人员手动执行。（此场景需要安装对应工具的TestNg工具插件才可以运行）
- 使用自动控制软件例如Jenkins 任务调度的形式自动执行测试用例（maven Ant）

## HelloWorld

示例代码地址：https://gitee.com/testdevops/TestNgDemo/tree/master/HelloworldTestng

第一个TestNG的实例代码

```java
public class TestNgHelloWorld {
    @Test
    public void TestNgHelloWorld(){
    
    System.out.println("hello world");
}

}
```

- 编辑器直接运行方式（需要安装Testng对应插件）

  ![image-20181010143449845](/Users/HelloWord/Library/Application Support/typora-user-images/image-20181010143449845.png)


- 配置运行TestNG.Xml方式

  1. 首先编写temp-testng-TestNgHelloWorld.xml(名称可自定义)

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
  <suite name="Default Suite">
    <test name="TestNgDemo">
      <classes>
        <class name="com.example.testng.HelloWorld.TestNgHelloWorld"/>
      </classes>
    </test> <!-- TestNgDemo -->
  </suite> <!-- Default Suite -->
  ```

  2、右键xml文件运行Run，此种方式是通过Xml文件直接执行测试用例


- 通过写代码的方式执行测试用例



  1、模拟以套件的形式代码实现方式

  ```java
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
  ```

  2、使用编码方式实现

```java
package com.example.testng.HelloWorld;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

/**
 *
 * 使用编程方式实现用例运行
 */
public class RunTestNgByProgrammatically {

    public static void main(String[] args) {

        TestListenerAdapter tla= new TestListenerAdapter();
        TestNG testng= new TestNG();
        testng.setTestClasses(new Class[]{TestNgHelloWorld.class});
        testng.addListener(tla);
        testng.run();
    }
}
```

## TestNG注解和生命周期



### @Test

| 注解参数             | 参数解释                                                     |
| -------------------- | ------------------------------------------------------------ |
| alwaysRun            | 如果设置为true，则即使依赖于失败的方法，也始终会运行此测试方法。 |
| dataProvider         | 此测试方法的数据提供程序的名称。                             |
| dataProviderClass    | 查找数据提供程序的类。如果未指定，则将在当前测试方法的类或其基类之一上查找数据提供程序。如果指定了此属性，则数据提供程序方法必须在指定的类上是静态的。 |
| `dependsOnGroups`    | 此方法所依赖的组列表。                                       |
| `dependsOnMethods`   | 此方法所依赖的方法列表。                                     |
| description          | 此方法的描述。                                               |
| enabled              | 是否启用此类/方法上的方法。                                  |
| `expectedExceptions` | 预期测试方法抛出的异常列表。如果抛出此列表中没有异常或不同异常，则此测试将标记为失败。 |
| `groups`             | 此类/方法所属的组列表。                                      |
| `invocationCount`    | 应该调用此方法的次数。                                       |
| `invocationTimeOut`  | 此测试应对所有调用计数的累计时间应采用的最大毫秒数。如果未指定invocationCount，则将忽略此属性。 |
| `priority`           | 此测试方法的优先级。将优先安排较低的优先事项。               |
| `successPercentage`  | 此方法预期的成功百分比                                       |
| `singleThreaded`     | 如果设置为true，则此测试类上的所有方法都保证在同一个线程中运行，即使当前正在使用parallel =“methods”运行测试。此属性只能在类级别使用，如果在方法级别使用，它将被忽略。注意：此属性曾被称为顺序（现已弃用）。 |
| `timeOut`            | 此测试应采用的最大毫秒数。                                   |
| `threadPoolSize`     | 此方法的线程池大小。该方法将从invocationCount指定的多个线程调用。 注意：如果未指定invocationCount，则忽略此属性 |



### @dataProvider

| **@dataProvider** | *将方法标记为为测试方法提供数据。带注释的方法必须返回一个Object [][]，其中每个Object []都可以分配测试方法的参数列表。想要从此DataProvider接收数据的@Test方法需要使用dataProvider名称等于此批注的名称。 |
| ----------------- | ------------------------------------------------------------ |
| 参数：name        | 此数据提供者的名称。如果未提供，则此数据提供程序的名称将自动设置为方法的名称。 |
| 参数：parallel   | 如果设置为true，则使用此数据提供程序生成的测试将并行运行。默认值为false。 |

### **@Factory**

**将方法标记为工厂，返回将由TestNG用作Test类的对象。该方法必须返回Object []。**

### **@Listeners**

| **@Listeners** | **在测试类上定义侦听器。**                |
| -------------- | ----------------------------------------- |
| `value`        | 继承org.testng.ITestNGListener`的类数组。 |

### @Parameters

| **@Parameters** | **描述如何将参数传递给@Test方法。** |
| --------------- | ----------------------------------- |
| `value`         | 用于填充此方法参数的变量列表。      |



### 生命周期注解

| 注解名称      | 注解含义                                              |
| ------------- | ----------------------------------------------------- |
| @BeforeSuite  | 该套件的所有测试都运行在注释的方法之前，仅运行一次    |
| @BeforeTest   | 在测试之前执行  只运行一次                            |
| @BeforeClass  | 调用该类第一个测试方法之前运行 只运行一次             |
| @BeforeGroups | 此方法在对应的Group测试用例执行前进行执行 会执行多次  |
| @BeforeMethod | 每个测试方法执行之前会执行该方法 会执行多次           |
| @Test         | 测试方法                                              |
| @AfterMethod  | 每个测试方法执行之后会执行该方法 会执行多次           |
| @AfterGroups  | 此方法在对应的Group测试用例执行后 进行执行 会执行多次 |
| @AfterClass   | 调用该类最后一个测试方法之后运行 只运行一次           |
| @AfterTest    | 调用该类的最后一个方法之后执行只运行一次              |
| @AfterSuite   | 该套件的所有测试都运行在注释的方法之后，仅运行一次    |

