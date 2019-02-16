package com.hariofspades.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class StartActivity extends AppCompatActivity {
    Button login,signup;
    Animation frombottom,fromtop;
    ImageView ballon;
    TextView welcome;



    private FirebaseAuth mAuth;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        login = (Button) findViewById(R.id.main_loginbtn);
        signup = (Button) findViewById(R.id.main_signup);
        ballon = (ImageView) findViewById(R.id.imageView);
        welcome = (TextView) findViewById(R.id.textView2);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        login.setAnimation(frombottom);
        signup.setAnimation(frombottom);
        ballon.setAnimation(fromtop);
        welcome.setAnimation(fromtop);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(log);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(StartActivity.this,RegisterActivity.class);
                startActivity(sign);
            }
        });
    }





    }

