package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    //declara atributos que vão receber os campos
    public TextView recebeNome;
    public TextView recebeEmail;
    public TextView recebeDataDeNasc;
    public TextView recebeTelef;
    public TextView recebeApresentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


    //verificar se foram passados parâmetros na tela
    Bundle bundle = getIntent().getExtras();
    if(bundle != null){
        //pega os vaores passados pela tela
        String nome = bundle.getString("nome");
        String email = bundle.getString("email");
        String dataDeNasc = bundle.getString("dataDeNasc");
        String telefone = bundle.getString("telefone");
        String apresentacao = bundle.getString("apresentacao");

        //busca o campo na activity e adiciona o texto vindo de outra tela a ele

        recebeNome = findViewById(R.id.nomeResul);
        recebeNome.setText(nome);
        recebeEmail = findViewById(R.id.emailResul);
        recebeEmail.setText(email);
        recebeDataDeNasc = findViewById(R.id.dataDeNascResul);
        recebeEmail.setText(dataDeNasc);
        recebeTelef = findViewById(R.id.telefResul);
        recebeTelef.setText(telefone);
        recebeApresentacao = findViewById(R.id.mensResul);
        recebeApresentacao.setText(apresentacao);

    }

    }

}
