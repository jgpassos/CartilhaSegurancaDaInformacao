package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class ComoMeProtegerActivity3 extends AppCompatActivity {

    TextToSpeech t1, t2, t3, t4, t5, t6;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_me_proteger3);

        Button btn_comomeproteger = (Button) findViewById(R.id.btnComomeproteger2);
        Button btnLer = findViewById(R.id.btnLer);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        textView3 = findViewById(R.id.txt3);
        textView4 = findViewById(R.id.txt4);
        textView5 = findViewById(R.id.txt5);
        textView6 = findViewById(R.id.txt6);

        btn_comomeproteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ComoMeProtegerActivity4.class);
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
                Intent intent = new Intent(getApplicationContext(), ComoMeProtegerActivity2.class);
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

        t3 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t3.setLanguage(Locale.getDefault());
                }
            }
        });

        t4 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t4.setLanguage(Locale.getDefault());
                }
            }
        });

        t5 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t5.setLanguage(Locale.getDefault());
                }
            }
        });

        t6 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR) {
                    t6.setLanguage(Locale.getDefault());
                }
            }
        });

        btnLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView1.getText().toString();
                String text2 = textView2.getText().toString();
                String text3 = textView3.getText().toString();
                String text4 = textView4.getText().toString();
                String text5 = textView5.getText().toString();
                String text6 = textView6.getText().toString();

                t1.speak(text, TextToSpeech.QUEUE_ADD, null);
                t2.speak(text2, TextToSpeech.QUEUE_ADD, null);
                t3.speak(text3, TextToSpeech.QUEUE_ADD, null);
                t4.speak(text4, TextToSpeech.QUEUE_ADD, null);
                t5.speak(text5, TextToSpeech.QUEUE_ADD, null);
                t6.speak(text6, TextToSpeech.QUEUE_ADD, null);
            }
        });
    }
}