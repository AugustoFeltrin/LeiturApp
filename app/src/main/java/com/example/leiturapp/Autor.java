package com.example.leiturapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Autor extends AppCompatActivity {

    private LinearLayout btnMontag, layoutDescMontag;
    private LinearLayout btnClarisse, layoutDescClarisse;
    private LinearLayout btnMildred, layoutDescMildred;
    private LinearLayout btnBeatty, layoutDescBeatty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        Button btnBack = findViewById(R.id.btnback);
        Button btnNext = findViewById(R.id.btn_next);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Autor.this, Revolta.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Autor.this, Fim.class);
                startActivity(intent);
            }
        });
    }
}

