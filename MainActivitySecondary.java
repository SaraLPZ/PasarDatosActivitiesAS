package com.example.pasardatosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivitySecondary extends AppCompatActivity {
    private TextView mensaje;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_secondary);

        mensaje=findViewById(R.id.mensaje);
        btnVolver=findViewById(R.id.btnVolver);

        String dato3 = getIntent().getStringExtra("dato");
        String dato4 =getIntent().getStringExtra("dato2");
        mensaje.setText("Hola  "+dato3+" "+dato4);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivitySecondary.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}