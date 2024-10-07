package com.example.leiturapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=dCRUuxaKTRM"));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ocultar o TextView
                textView.setVisibility(View.GONE);

                // Mostrar e reproduzir o VideoView
                videoView.setVisibility(View.VISIBLE);
                videoView.start();

        ImageView solImageView = findViewById(R.id.sol);
        Animation pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        solImageView.startAnimation(pulseAnimation);

        Button button = findViewById(R.id.iniciar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Preludio.class);
                startActivity(intent);
            }
        });
    }
}
