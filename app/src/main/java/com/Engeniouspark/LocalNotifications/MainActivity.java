package com.Engeniouspark.LocalNotifications;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.Engeniouspark.LocalNotifications.notification.NotificationHelper;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    private EditText hours;
    private EditText minutes;

    private ImageView activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        boolean isEnabled = true;

        if (isEnabled) {
            NotificationHelper.scheduleRepeatingRTCNotification(mContext);
            NotificationHelper.enableBootReceiver(mContext);
        } else {
            NotificationHelper.cancelAlarmRTC();
            NotificationHelper.disableBootReceiver(mContext);
        }
    }


}
