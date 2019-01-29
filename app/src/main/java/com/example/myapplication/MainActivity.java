package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

class MainActivity extends AppCompatActivity {
Animation bounce;
ImageView bounceimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//HIDING THE TITLE BAR FOR ONLY 1 ACTIVITY(MAIN ACTIVITY)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

//ANIMATION
        bounceimage=findViewById(R.id.bounceimage);
        bounce= AnimationUtils.loadAnimation(MainActivity.this,R.anim.mainpagebounce);
        bounceimage.startAnimation(bounce);

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
            Intent i=new Intent(MainActivity.this,mainpage.class);
            startActivity(i);

//PREVENTING FROM OPENING FLASH SCREEN ON BACK PRESS(DESTROYING THE ACTIVITY)
            MainActivity.this.finish();
        }
    }
}
