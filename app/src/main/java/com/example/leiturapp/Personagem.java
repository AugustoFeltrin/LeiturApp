package com.example.leiturapp;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Personagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        LinearLayout btnMontag = findViewById(R.id.btn_montag);
        TextView descMontag = findViewById(R.id.desc_montag);
        LinearLayout btnMildred = findViewById(R.id.btn_mildred);
        TextView descMildred = findViewById(R.id.desc_mildred);
        LinearLayout btnBeatty = findViewById(R.id.btn_beatty);
        TextView descBeatty = findViewById(R.id.desc_beatty);
        LinearLayout btnFaber = findViewById(R.id.btn_faber);
        TextView descFaber = findViewById(R.id.desc_faber);
        LinearLayout btnClarisse = findViewById(R.id.btn_clarisse);
        TextView descClarisse = findViewById(R.id.desc_clarisse);

        btnMontag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(descMontag);
            }
        });

        btnMildred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(descMildred);
            }
        });

        btnBeatty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(descBeatty);
            }
        });

        btnFaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(descFaber);
            }
        });

        btnClarisse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(descClarisse);
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


