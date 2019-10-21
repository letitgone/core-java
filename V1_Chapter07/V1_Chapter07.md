# Core Java(Volume 1_Fundamentals)
    core java notes
## V1_Chapter 7: 异常，断言和日志
1.当程序发生错误时，应该做到以下几点：   
1）向用户通告错误；   
2）保存所有的工作结果；   
3）允许用户以妥善的形式退出程序。
### 7.1 处理错误
1.在Java程序设计语言中，异常对象都是派生于Throwable类的一个实例。   
2.Java异常层次结构简化示意图：
![Image text](src/main/resources/image/ExceptionDiagram.jpeg)
3.所有的异常都是由Throwable继承而来。   
4.Error类层次结构描述了Java运行时系统的内部错误和资源耗尽错误，应用程序不应该抛出这种类型的对象，如果出现了这样的内
部错误，除了通告给用户，并尽力使程序安全地终止之外，再也无能为力，这种情况很少出现。   
5.Exception分为两个分支：一个分支派生于RuntimeException，另一个分支包含其他异常，划分两个分支的规则是：由程序错误
导致的异常属于RuntimeException，而程序本身没有问题，但由于像I/O错误这类问题导致的异常属于其他异常。   
派生于RuntimeException的异常包含下面几种情况：   
1）错误的类型转换；   
2）数组访问越界；   
3）访问null指针。   
不是派生于RuntimeException的异常包含：  
1）试图在文件尾部后面读取数据；   
2）试图打开一个不存在的文件；   
3）试图根据给定的字符串查找Class对象，而这个字符串表示的类不存在。   
6.Java语言规范将派生于Error类或者RuntimeException类的所有异常称为非受查（unchecked）异常，所有其他的异常称为受
查（checked）异常，编译器将检查是否为所有的受查异常提供了异常处理器。   
7.
8.
9.
