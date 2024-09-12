package com.example.aula20240205;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Login extends Activity {
    private EditText login = findViewById(R.id.editTextTextNomeLogin);
    private EditText senha = findViewById(R.id.editTextTextPassword);

    private TextView mensagem = findViewById(R.id.textViewErroLogin);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        login.setText("");
        senha.setText("");
    }

    public void autenticar(View view){
        String strLogin = login.getText().toString();
        String strSenha = senha.getText().toString();

        //inclusão de padrão de projeto Value Objects
        LoginVO LoginVO = new LoginVO();
        loginVO.setLogin(strLogin);
        loginVO.setSenha(strSenha);

        if (loginVO.getLogin().equals("admin") && loginVO.getsenha().equals("12345")){
            Intent menu = new Intent(this, Menu.class);
            menu.putExtra("login",loginVO.getLogin());
            startActivity(menu);
        }

        else {
            mensagem.setText("Autenticação Inválida");
        }
    }
}
