package com.example.d2a.maincalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Calculator extends AppCompatActivity {

    private Button tambah,kurang,bagi,kali,hapus;
    private String saya="Kalkulator Sederhana";
    private TextView tampilText,tampilHasil;
    private EditText angka1,angka2;
    private Integer a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tampilText=(TextView)findViewById(R.id.textView);
        tampilText.setText(saya);
        angka1=(EditText)findViewById(R.id.editText);
        angka2=(EditText)findViewById(R.id.editText2);
        tambah=(Button)findViewById(R.id.button);
        kurang=(Button)findViewById(R.id.button2);
        bagi=(Button)findViewById(R.id.button3);
        kali=(Button)findViewById(R.id.button4);
        hapus=(Button)findViewById(R.id.button5);
        tampilHasil=(TextView)findViewById(R.id.textView5);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(angka1.getText().toString());
                b=Integer.parseInt(angka2.getText().toString());
                c=a+b;
                tampilHasil.setText(c.toString());
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(angka1.getText().toString());
                b=Integer.parseInt(angka2.getText().toString());
                c=a-b;
                tampilHasil.setText(c.toString());
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(angka1.getText().toString());
                b=Integer.parseInt(angka2.getText().toString());
                c=a/b;
                tampilHasil.setText(c.toString());
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(angka1.getText().toString());
                b=Integer.parseInt(angka2.getText().toString());
                c=a*b;
                tampilHasil.setText(c.toString());
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c=0;
                a=Integer.parseInt(angka1.getText().toString());
                b=Integer.parseInt(angka2.getText().toString());
                tampilHasil.setText(c.toString());


            }
        });




        //tampilAngka=(TextView)findViewById(R.id.textView2);
        //tampilPecahan=(TextView)findViewById(R.id.textView3);

        //tampilAngka.setText(a.toString());
        //angka1=7;
        //angka2=2;
        //c=Integer.parseInt(angka1.toString())/Integer.parseInt(angka2.toString());
        //c=Double.parseDouble(angka1.toString())/Double.parseDouble(angka2.toString());
        //tampilPecahan.setText(c.toString());

    }
}
