package com.Engeniouspark.LocalNotifications.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ptyagi on 4/18/17.
 */

public class AlarmBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {

            NotificationHelper.scheduleRepeatingRTCNotification(context);
        }
    }
}
