package com.luomo.gexception;

import android.app.Application;
import com.luomo.gexception.utils.CrashHandler;

public class CrashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
