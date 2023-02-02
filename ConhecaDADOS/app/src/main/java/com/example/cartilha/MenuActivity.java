package com.example.cartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button buttonConhecendoDados = (Button) findViewById(R.id.buttonConhecendoDados);

        buttonConhecendoDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ConhecendoDadosActivity.class);
                startActivity(intent);
            }
        });

        Button buttonLeisEDireitos = (Button) findViewById(R.id.buttonLeisEDireitos);

        buttonLeisEDireitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LeisEDireitosActivity.class);
                startActivity(intent);
            }
        });

        Button buttonComoMeProteger = (Button) findViewById(R.id.buttonComoMeProteger);

        buttonComoMeProteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ComoMeProtegerActivity.class);
                startActivity(intent);
            }
        });

        Button buttonPerigosNaInternet = (Button) findViewById(R.id.buttonPerigosNaInternet);

        buttonPerigosNaInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PerigosNaInternetActivity.class);
                startActivity(intent);
            }
        });

        Button buttonCanaisDeInformacao = (Button) findViewById(R.id.buttonCanaisDeInformacao);

        buttonCanaisDeInformacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CanaisDeInformacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}