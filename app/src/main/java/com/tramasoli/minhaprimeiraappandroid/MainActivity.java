package com.tramasoli.minhaprimeiraappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnCalcular);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText anoInformado = findViewById(R.id.txtAno);
                LocalDate hoje = LocalDate.now();
                Integer idade = hoje.getYear() - Integer.parseInt(anoInformado.getText().toString());
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra(SegundaActivity.inputIdade, idade);
                startActivity(intent);
            }
        });
    }
}