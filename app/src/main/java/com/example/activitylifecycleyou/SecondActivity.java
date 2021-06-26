package com.example.activitylifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button mBtnLaunchThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mBtnLaunchThirdActivity= findViewById(R.id.btnLaunchThirdActivity);
        mBtnLaunchThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open Third screen
                Toast.makeText(SecondActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                //go to Third screen
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        Log.d("SecondActivity","onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondActivity","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
}