package com.example.aula20240205;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class Login extends Activity {
    private EditText login;
    private EditText senha;
    private TextView mensagem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        login = findViewById(R.id.editTextTextNomeLogin);
        senha = findViewById(R.id.editTextTextPassword);
        mensagem = findViewById(R.id.textViewErroLogin);
        login.setText("");
        senha.setText("");
        mensagem.setText("");
    }

    public void autenticar(View view){
        login = findViewById(R.id.editTextTextNomeLogin);
        senha = findViewById(R.id.editTextTextPassword);
        mensagem = findViewById(R.id.textViewErroLogin);

        //inclusão de padrão de projeto Value Objects
        LoginVO loginVO = new LoginVO();
        loginVO.setLogin(login.getText().toString());
        loginVO.setSenha(senha.getText().toString());

        if (loginVO.getLogin().equals("admin") && loginVO.getSenha().equals("12345")){
            Intent menu = new Intent(this, Menu.class);
            menu.putExtra("login",loginVO.getLogin());
            startActivity(menu);
        }

        else {
            mensagem.setText("Autenticação Inválida");
        }
    }
}
