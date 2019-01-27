package com.example.customcomponent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    static int batLevel,batLevel1;
    BatteryManager bm;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);

        bm = (BatteryManager)getSystemService(BATTERY_SERVICE);
        batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);

        tv.setText(Integer.valueOf(batLevel).toString()+"%");


    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    int per(){
        //batLevel1 =batLevel;
        return batLevel;
    }
}
