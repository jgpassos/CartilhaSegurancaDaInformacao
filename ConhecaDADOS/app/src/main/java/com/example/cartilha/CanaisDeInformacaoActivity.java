package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanaisDeInformacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canais_de_informacao);

        Button buttonProxPaginaCanaisDeInformacao1 = (Button) findViewById(R.id.buttonProxPaginaCanaisDeInformacao1);
        Button buttonHome = findViewById(R.id.btn_home);
        Button anterior = findViewById(R.id.btn_anterior);

        buttonProxPaginaCanaisDeInformacao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CanaisDeInformacaoActivity2.class);
                startActivity(intent);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PerigosNaInternetActivity5.class);
                startActivity(intent);
            }
        });
    }
}