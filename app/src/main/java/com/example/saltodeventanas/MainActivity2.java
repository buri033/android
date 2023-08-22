package com.example.saltodeventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnVolver, btnSuma, btnResta, btnMultiplicacion, btnDivision;
    TextView txtresultado, txt1, txt2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button btnVolver = findViewById(R.id.btnvolver);
        Button btnSuma = findViewById(R.id.btnsuma);
        Button btnResta = findViewById(R.id.btnresta);
        Button btnMultiplicacion = findViewById(R.id.btnmultiplicacion);
        Button btnDivision = findViewById(R.id.btndivi);
        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txtresultado = findViewById(R.id.txtresultado);

        //Set click listener for the volver button
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }

        });
        //Set click listener for the suma button
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                int n1 = Integer.parseInt(txt1.getText().toString());
                int n2 = Integer.parseInt(txt2.getText().toString());
                int suma = n1 + n2;
                txtresultado.setText("La suma es: " + suma);

            }

        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                int n1 = Integer.parseInt(txt1.getText().toString());
                int n2 = Integer.parseInt(txt2.getText().toString());
                int resta = n1 - n2;
                txtresultado.setText("La resta es: " + resta);
            }


        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                int n1 = Integer.parseInt(txt1.getText().toString());
                int n2 = Integer.parseInt(txt2.getText().toString());
                int multi = n1 * n2;
                txtresultado.setText("La multiplicación es: " + multi);
            }


        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                int n1 = Integer.parseInt(txt1.getText().toString());
                int n2 = Integer.parseInt(txt2.getText().toString());
                if (n2 != 0) {
                    double divi = n1 / n2;
                    txtresultado.setText("La división es: " + divi);
                } else {
                    txtresultado.setText("No se puede dividir entre 0");
                }

            }
            });
        }
    }


