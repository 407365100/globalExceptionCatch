# globalExceptionCatch
##概述
这个项目是实现对特定异常（全局异常中那些未捕获的异常）的捕获
<br/>
	
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
