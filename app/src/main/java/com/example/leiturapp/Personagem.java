package com.example.leiturapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Personagem extends AppCompatActivity {

    private LinearLayout btnMontag, layoutDescMontag;
    private LinearLayout btnClarisse, layoutDescClarisse;
    private LinearLayout btnMildred, layoutDescMildred;
    private LinearLayout btnBeatty, layoutDescBeatty;
    private LinearLayout btnFaber, layoutDescFaber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        Button btnBack = findViewById(R.id.btnback);
        Button btnNext = findViewById(R.id.btn_next);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Personagem.this, Revolta.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Personagem.this, Adaptacoes.class);
                startActivity(intent);
            }
        });

        btnMontag = findViewById(R.id.btn_montag);
        layoutDescMontag = findViewById(R.id.layout_desc_montag);
        btnClarisse = findViewById(R.id.btn_clarisse);
        layoutDescClarisse = findViewById(R.id.layout_desc_clarisse);
        btnMildred = findViewById(R.id.btn_mildred);
        layoutDescMildred = findViewById(R.id.layout_desc_mildred);
        btnBeatty = findViewById(R.id.btn_beatty);
        layoutDescBeatty = findViewById(R.id.layout_desc_beatty);
        btnFaber = findViewById(R.id.btn_faber);
        layoutDescFaber = findViewById(R.id.layout_desc_faber);

        btnMontag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(layoutDescMontag);
            }
        });

        btnClarisse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(layoutDescClarisse);
            }
        });

        btnMildred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(layoutDescMildred);
            }
        });

        btnBeatty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(layoutDescBeatty);
            }
        });

        btnFaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(layoutDescFaber);
            }
        });
    }

    private void toggleVisibility(View view) {
        if (view.getVisibility() == View.GONE) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }
}

