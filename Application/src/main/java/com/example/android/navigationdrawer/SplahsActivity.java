package com.example.android.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by appcreate32 on 2016. 9. 6..
 */
public class SplahsActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler hd=new Handler();
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },3000);
    }
}
