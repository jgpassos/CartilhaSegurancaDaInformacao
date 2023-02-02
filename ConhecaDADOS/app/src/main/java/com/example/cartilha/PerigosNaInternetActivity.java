package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerigosNaInternetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perigos_na_internet);

        Button btn_perigosnainternet = (Button) findViewById(R.id.btn_PerigosNaInternet1);

        btn_perigosnainternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PerigosNaInternetActivity2.class);
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
                Intent intent = new Intent(getApplicationContext(), ComoMeProtegerActivity6.class);
                startActivity(intent);
            }
        });
    }
}