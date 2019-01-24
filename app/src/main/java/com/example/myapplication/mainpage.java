package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class mainpage extends AppCompatActivity {
    ImageView i1;
    Animation rotate,scale,trans,alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        i1=findViewById(R.id.i1);
//        i2=findViewById(R.id.i2);
//        i3=findViewById(R.id.i3);
//        i4=findViewById(R.id.i4);
        scale= AnimationUtils.loadAnimation(mainpage.this,R.anim.scale_anim);

        rotate= AnimationUtils.loadAnimation(mainpage.this,R.anim.rotate_anim);
//        i2.startAnimation(rotate);
        trans= AnimationUtils.loadAnimation(mainpage.this,R.anim.trans_anim);
//        i3.startAnimation(trans);
        alpha= AnimationUtils.loadAnimation(mainpage.this,R.anim.alpha_anim);
//        i4.startAnimation(alpha);
        i1.startAnimation(scale);
    }
}
