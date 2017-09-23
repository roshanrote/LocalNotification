package com.Engeniouspark.LocalNotifications;

/**
 * Created by engenius4 on 21/9/17.
 */

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
