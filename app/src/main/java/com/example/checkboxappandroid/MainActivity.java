package com.example.checkboxappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private CheckBox chek1,check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.txt_num1);
        et2=(EditText) findViewById(R.id.txt_numero2);
        tv1=(TextView) findViewById(R.id.txt_Resultado);
        chek1=(CheckBox) findViewById(R.id.chk_boxSumar);
        check2=(CheckBox) findViewById(R.id.chk_BoxRestar);

    }

    public void Calcular(View calcular){
        String valor1_String=et1.getText().toString();
        String valor2_String=et2.getText().toString();
        int valor1_int= Integer.parseInt(valor1_String);
        int valor2_int=Integer.parseInt(valor2_String);

        String resultado="";//Declaramos variable de acumulación

        if (chek1.isChecked()==true){
            int suma=valor1_int+valor2_int;
            resultado="La suma es:  "+ suma + " ||  ";
        }
        if(check2.isChecked()==true){
            int resta=valor1_int-valor2_int ;
            resultado= resultado +"La resta es " + resta;
        }

        tv1.setText(resultado);
    }

}