package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class CanaisDeInformacaoActivity5 extends AppCompatActivity {

    TextToSpeech t1, t2;
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canais_de_informacao5);

        Button buttonProxPaginaCanaisDeInformacao5 =
                (Button) findViewById(R.id.buttonProxPaginaCanaisDeInformacao5);
        Button home = findViewById(R.id.btn_home);
        Button anterior = findViewById(R.id.btn_anterior);
        Button btnLer = findViewById(R.id.btnLer);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);

        buttonProxPaginaCanaisDeInformacao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

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
                Intent intent = new Intent(getApplicationContext(), CanaisDeInformacaoActivity4.class);
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