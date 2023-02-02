package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class LeisEDireitosActivity4 extends AppCompatActivity {

    TextToSpeech t1;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leis_edireitos4);

        Button buttonProxPagina9 = (Button) findViewById(R.id.buttonProxPagina9);
        Button btnLer = findViewById(R.id.btnLer);

        textView1 = findViewById(R.id.txt1);

        buttonProxPagina9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LeisEDireitosActivity4pt2.class);
                startActivity(intent);
            }
        });

        Button home = findViewById(R.id.btn_home);
        Button anterior = findViewById(R.id.btn_anterior);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LeisEDireitosActivity3.class);
                startActivity(intent);
            }
        });

        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.getDefault());
                }
            }
        });

        btnLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView1.getText().toString();
                t1.speak(text, TextToSpeech.QUEUE_ADD, null);
            }
        });
    }
}