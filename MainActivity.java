package com.example.pasardatosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etName,etSurname;
    private Button btnEniar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etSurname=findViewById(R.id.etSurname);
        btnEniar=findViewById(R.id.btnEnviar);

        btnEniar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String surname=etSurname.getText().toString();
                //De donde a donde
                Intent i = new Intent(MainActivity.this,MainActivitySecondary.class);
                //Lo que quiero que se lleve
                i.putExtra("dato",name);
                i.putExtra("dato2",surname);
                //Inicializar
                startActivity(i);
            }
        });

    }
}