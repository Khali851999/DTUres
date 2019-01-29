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
import android.widget.LinearLayout;

public class mainpage extends AppCompatActivity implements Animation.AnimationListener {
    ImageView i1,i2,i3,i4;
    LinearLayout ll1,ll2,ll3,ll4;
    Animation rotate,scale,scale1,trans,alpha;
    Button b;

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

        scale= AnimationUtils.loadAnimation(mainpage.this,R.anim.scale_anim);
        scale1= AnimationUtils.loadAnimation(mainpage.this,R.anim.scale1_anim);
        alpha= AnimationUtils.loadAnimation(mainpage.this,R.anim.alpha_anim);
        ll1.startAnimation(scale);
        ll2.startAnimation(scale);
        ll3.startAnimation(scale);
        ll4.startAnimation(scale);
        ll1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                ll1.startAnimation(scale1);

                return false;
            }
        });



    }
    public void vv(View view){

        switch (view.getId()) {
            case R.id.ll1:
                i1.startAnimation(alpha);
                alpha.setAnimationListener(this);
                break;
            case R.id.ll2:
                i2.startAnimation(alpha);
                alpha.setAnimationListener(this);
                break;
            case R.id.ll3:
                i3.startAnimation(alpha);
                alpha.setAnimationListener(this);
                break;
            case R.id.ll4:
                i4.startAnimation(alpha);
                alpha.setAnimationListener(this);
                break;

        }
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
}
