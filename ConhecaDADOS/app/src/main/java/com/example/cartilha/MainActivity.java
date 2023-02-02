package com.example.cartilha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.buttonInformacoesInstituicoes);

        SpannableString s = new SpannableString("Informações para instituições");

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Toast.makeText(MainActivity.this, "Informações para instituições",
                        Toast.LENGTH_SHORT).show();
            }
        };

        s.setSpan(clickableSpan1, 0, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(s);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InstituicoesActivity.class);
                startActivity(intent);
            }
        });

        // Botões:

        Button btnSaberMais = (Button) findViewById(R.id.buttonSaberMais);

        btnSaberMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CartilhaActivity.class);
                startActivity(intent);
            }
        });
    }
}