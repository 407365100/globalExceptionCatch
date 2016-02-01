package com.luomo.gexception;

import android.app.Activity;
import android.os.Bundle;

public class ExceptionActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(1/0==0){

        }

        /*try {
            if(1/0==0){

            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "自己捕获的服务器异常", Toast.LENGTH_SHORT).show();
        }*/
    }
}