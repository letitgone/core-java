# Core Java(Volume 1_Fundamentals)
    core java notes
## V1_Chapter 14 并发
### 14.1 什么是线程
1.sleep是Thread类的静态方法，用于暂停当前线程的活动，sleep方法可以抛出一个InterruptedException异常。   
2.由于Runnable接口是一个函数式接口，可以用lambda表达式建立一个实例：
```
Runnable r = () -> {task code};
```
3.直接调用run()方法，只会执行同一个线程中的任务，而不会启动新线程，应该调用Thread.start()方法，这个方法将创建一个
执行run()方法的新线程。   
4.
