package com.example.aula20240205;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Menu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu);
    }

    public void cadastrar(View view){
        Intent cadastro = new Intent(this, Cadastro.class);
        startActivity(cadastro);
    }

    public void pesquisar(View view){
        Intent pesquisa = new Intent(this, Pesquisa.class);
        startActivity(pesquisa);
    }
}
