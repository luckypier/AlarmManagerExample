package com.zyx.alarmmanagerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by pier on 3/22/18.
 */

public class MyAlarmBroadcastReceiver extends BroadcastReceiver {

    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {

        //you can check the log that it is fired
        //Here we are actually not doing anything
        //but you can do any task here that you want to be done at a specific time everyday

        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
        String format = s.format(new Date());

        Log.d("MyAlarmBroadcastReceiver", "Alarm just fired");
        Log.d("time ::", format);

    }

}