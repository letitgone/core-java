# Core Java(Volume 2_Advanced Features)
    core java notes
## V2_Chapter 6 日期和时间API
### 6.1 时间线
1.原子钟网络一直被当作官方时间。   
2.在Java中，Instant表示时间线上的某个点，被称为"新纪元"的时间线原点被设置为穿过伦敦格林威治皇家天文台的本初子午线
所处时区的1970年1月1日的午夜。
3.Instant的值向回可追溯10亿年（Instant.MIN），最大值Instant.MAX是公元1000000000年的12月31日。   
4.Instant:
```
Instant start = Instant.now();
runAlagorithm();
Instant end = Instant.now();
Duration timeElapsed = Duration.between(start,end);
long millis = timeElapsed.toMillis();
```
Duration是两个时刻之间的时间量，对象内部存储所需的空间超过了一个long值，因此秒数存储在一个long中，而纳秒数存储在一
个额外的int中。大约300年时间对应的纳秒数才会溢出long的范围。
### 6.2 本地时间
1.API的设计者们推荐程序员不要使用时区时间，除非确实想要表达绝对时间的实例，生日，假日，计划时间通常最好都表示成本地
日期和时间。   
### 6.3 时间调整器
### 6.4 本地时间
1.还有一个表示日期和时间的LocalDateTime类，这个类适合存储固定时区的时间点，但是如果你的计算需要跨越夏令，或者需要处
理不同时区的用户，那么就应该使用ZonedDateTime类。
### 6.5 时区时间
### 6.6 格式化和解析
### 6.7 与遗留代码的操作
