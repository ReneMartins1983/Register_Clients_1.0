package com.lasalle.mobile.cadastro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    Spinner spinnerEsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editTextName);
        spinnerEsc = (Spinner) findViewById((R.id.spinnerEscolaridade));
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enviarMSG();


            }
        });
    }
    public void enviarMSG()
    {
        AlertDialog.Builder msg = new AlertDialog.Builder(this);
        msg.setMessage("Olá" + editText.getText().toString()+" Seu cadastro foi realizado com sucesso!");
        msg.show();
    }
}