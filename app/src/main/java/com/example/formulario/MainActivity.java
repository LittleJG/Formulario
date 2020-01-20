package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<nomeTex> extends AppCompatActivity {

    //Declara atributo que vai receber o id do campo
    public EditText nome;
    public EditText email;
    public EditText dataDeNasc;
    public EditText telefone;
    public EditText apresentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximaTela(View view) {
        //declara variaveis que vão pegar os campos
        //View = tela
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        dataDeNasc = findViewById(R.id.dataDeNasc);
        telefone = findViewById(R.id.telefone);
        apresentacao = findViewById(R.id.apresentacao);


        String nomeTex = nome.getText().toString();
        String emailTex = email.getText().toString();
        String dataDenascTex = dataDeNasc.getText().toString();
        String telefoneTex = telefone.getText().toString();
        String apresentacaoTex = apresentacao.getText().toString();

        Intent intent = new Intent(this, Resultado.class);

        //envia campo para proxima activity
        intent.putExtra("nome", nomeTex);
        intent.putExtra("email", emailTex);
        intent.putExtra("dataDeNasc", dataDenascTex);
        intent.putExtra("telefone", telefoneTex);
        intent.putExtra("apresentacao", apresentacaoTex);

        startActivity(intent);
    }




}

