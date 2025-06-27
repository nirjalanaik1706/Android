package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button blink,zoom_out,zoom_in,bounce,fade_in,fade_out;
    Animation animBlink,anzoomin,anzoomout,anbounce,anfadein,anfadeout;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       blink=(Button)findViewById(R.id.btn);
       zoom_in=(Button)findViewById(R.id.btn3) ;
       zoom_out=(Button)findViewById(R.id.btn2);
       bounce=(Button)findViewById(R.id.btn4);
       fade_in=(Button)findViewById(R.id.btn5);
       fade_out=(Button)findViewById(R.id.btn6) ;
       img=(ImageView)findViewById(R.id.imgbtn);

       blink.setOnClickListener(this);
       zoom_in.setOnClickListener(this);
        zoom_out.setOnClickListener(this);
        bounce.setOnClickListener(this);
        fade_out.setOnClickListener(this);
        fade_in.setOnClickListener(this);


       animBlink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        anzoomin= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        anzoomout= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        anbounce= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bouncing);
        anfadein= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        anfadeout= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);


    }


    @Override
    public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.btn:
                img.setVisibility(View.VISIBLE);
                img.startAnimation(animBlink);
                break;

                case R.id.btn2:
                    img.setVisibility(View.VISIBLE);
                    img.startAnimation(anzoomout);
                    break;

                case R.id.btn3:
                    img.setVisibility(View.VISIBLE);
                    img.startAnimation(anzoomin);
                    break;

                case R.id.btn4:
                    img.setVisibility(View.VISIBLE);
                    img.startAnimation(anbounce);
                    break;

                case R.id.btn5:
                    img.setVisibility(View.VISIBLE);
                    img.startAnimation(anfadein);
                    break;

                case R.id.btn6:
                    img.setVisibility(View.VISIBLE);
                    img.startAnimation(anfadeout);
                    break;
            }
        }

    }
