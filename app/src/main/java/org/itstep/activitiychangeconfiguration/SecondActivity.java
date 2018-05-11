package org.itstep.activitiychangeconfiguration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity
{

    private static final String TAG = "DebugSecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.b_back);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               finish();
            }
        });
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop()
    {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onPause()
    {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onDestroy()
    {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
