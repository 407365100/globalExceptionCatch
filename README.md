# globalExceptionCatch
##概述
这个项目是实现对特定异常（全局异常中那些未捕获的异常）的捕获
<br/>
Thread的run方法是不抛出任何检查型异常(checked exception)的,但是它自身却可能因为一个异常而被终止，导致这个线程的终结<br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JDK5.0之前，不能为单独的Thread设置UncaughtExceptionHandler，也不能指定一个默认的UncaughtExceptionHandler。为了可以设置一个UncaughtExceptionHandler，需要去继承ThreadGroup并覆写uncaughtException方法<br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JDK5.0及之后，我们通过Thread的实例方法setUncaughtExceptionHandler，可以为任何一个Thread设置一个UncaughtExceptionHandler。当然你也可以为所有Thread设置一个默认的UncaughtExceptionHandler，通过调用Thread.setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)方法,这是Thread的一个static方法
	
|文件|作用|
|:---|:---|
|snapshot|程序运行的.gif图|
|CrashHandler.java|实现了Thread.UncaughtExceptionHandler,处理全局异常|
|CrashApplication.java|初始化全局异常处理类|
|ExceptionActivity.java|产生异常|
##主要代码
####CrashApplication.java

    CrashHandler crashHandler = CrashHandler.getInstance();
    crashHandler.init(getApplicationContext());

##运行效果图
![enter image description here](http://img.blog.csdn.net/20160128131146840)
