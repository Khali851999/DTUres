package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//HIDING THE TITLE BAR FOR ONLY 1 ACTIVITY(MAIN ACTIVITY)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

//SETTING FLASH SCREEN
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();
    }
    private class LogoLauncher extends Thread{
        @Override
        public void run() {
            try{
                sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);

//PREVENTING FROM OPENING FLASH SCREEN ON BACK PRESS(DESTROYING THE ACTIVITY)
            MainActivity.this.finish();
        }
    }
}
