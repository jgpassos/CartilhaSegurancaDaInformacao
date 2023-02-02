package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class PerigosNaInternetActivity2 extends AppCompatActivity {

    TextToSpeech t1, t2;
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perigos_na_internet2);

        Button btn_perigosnainternet = (Button) findViewById(R.id.btn_PerigosNaInternet2);
        Button btnLer = findViewById(R.id.btnLer);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);

        btn_perigosnainternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PerigosNaInternetActivity3.class);
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
                Intent intent = new Intent(getApplicationContext(), PerigosNaInternetActivity.class);
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

        t2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t2.setLanguage(Locale.getDefault());
                }
            }
        });

        btnLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView1.getText().toString();
                String text2 = textView2.getText().toString();

                t1.speak(text, TextToSpeech.QUEUE_ADD, null);
                t2.speak(text2, TextToSpeech.QUEUE_ADD, null);
            }
        });
    }
}