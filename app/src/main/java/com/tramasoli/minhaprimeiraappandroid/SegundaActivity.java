package com.tramasoli.minhaprimeiraappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    public static final String inputIdade = "idade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        Integer idade = intent.getIntExtra(inputIdade, -1);
        TextView txtIdade2 = findViewById(R.id.txtIdade2);
        txtIdade2.setText(idade.toString());
    }
}