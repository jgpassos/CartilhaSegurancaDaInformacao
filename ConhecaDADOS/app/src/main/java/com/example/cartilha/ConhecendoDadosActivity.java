package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConhecendoDadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conhecendo_dados);

        Button buttonProxPagina2 = (Button) findViewById(R.id.buttonProxPagina2);

        buttonProxPagina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ConhecendoDadosActivity2.class);
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
                Intent intent = new Intent(getApplicationContext(), CartilhaActivity2.class);
                startActivity(intent);
            }
        });
    }
}