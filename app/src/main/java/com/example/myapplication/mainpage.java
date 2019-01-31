package com.example.myapplication;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class mainpage extends AppCompatActivity implements Animation.AnimationListener {
    ImageView i1,i2,i3,i4;
    LinearLayout ll1,ll2,ll3,ll4,ll5;
    Animation rotate,scale,scale1,trans,alpha;
    Button b;
    ImageView b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mainpage);
        getSupportActionBar().hide();

        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        ll1=findViewById(R.id.ll1);
        ll2=findViewById(R.id.ll2);
        ll3=findViewById(R.id.ll3);
        ll4=findViewById(R.id.ll4);
        ll5=findViewById(R.id.ll5);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);

        scale= AnimationUtils.loadAnimation(mainpage.this,R.anim.scale_anim);
        scale1= AnimationUtils.loadAnimation(mainpage.this,R.anim.scale1_anim);
        alpha= AnimationUtils.loadAnimation(mainpage.this,R.anim.alpha_anim);
        trans=AnimationUtils.loadAnimation(mainpage.this,R.anim.trans_anim);
        ll1.startAnimation(scale);
        ll2.startAnimation(scale);
        ll3.startAnimation(scale);
        ll4.startAnimation(scale);
        ll5.startAnimation(trans);
        ll1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                ll1.startAnimation(scale1);

                return false;
            }
        });

    }

    //onclick for 4ll
    public void vv(View view){
                i1.startAnimation(alpha);
                alpha.setAnimationListener(this);
    }
    public void vv2(View view) {
        i2.startAnimation(alpha);
        alpha.setAnimationListener(this);
    }
    public void vv3(View view) {
        i3.startAnimation(alpha);
        alpha.setAnimationListener(this);
    }
    public void vv4(View view) {
        i4.startAnimation(alpha);
        alpha.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }
    @Override
    public void onAnimationEnd(Animation animation)
{
    Intent intent1=new Intent(mainpage.this,Main2Activity.class);
    startActivity(intent1);

}

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

//onclick methods for 4 buttons on bottom
    public void b1(View view) {

    }

    public void b2(View view) {
        Intent ib2=new Intent(mainpage.this,maps.class);
        startActivity(ib2);
    }

    public void b3(View view) {
    }

    public void b4(View view) {
    }


}
