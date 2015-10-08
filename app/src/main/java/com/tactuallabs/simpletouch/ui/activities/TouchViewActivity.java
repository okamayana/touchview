package com.tactuallabs.simpletouch.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.tactuallabs.simpletouch.R;

public class TouchViewActivity extends Activity {

    public static void start(Context context) {
        Intent intent = new Intent(context, TouchViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_view);
    }
}
