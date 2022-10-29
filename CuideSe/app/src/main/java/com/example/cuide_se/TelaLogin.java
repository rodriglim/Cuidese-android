package com.example.cuide_se;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Objects;

public class TelaLogin extends AppCompatActivity {
    private ImageButton btnemail, btngoogle, btnfacebook, btnapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(this.getSupportActionBar()).hide();

        btnemail = findViewById(R.id.btnemail);
        btngoogle = findViewById(R.id.btngoogle);
        btnfacebook = findViewById(R.id.btnfacebook);
        btnapple = findViewById(R.id.btnapple);


        Animation animation = new AlphaAnimation(0, 1);
        animation.setDuration(1);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatMode(Animation.REVERSE);

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnemail.startAnimation(animation);
                Intent intent = new Intent(getApplicationContext(), TelaCategoria.class);
                startActivity(intent);
            }
        });

        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btngoogle.startAnimation(animation);

            }
        });

        btnfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnfacebook.startAnimation(animation);
            }
        });

        btnapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnapple.startAnimation(animation);
            }
        });
    }
}