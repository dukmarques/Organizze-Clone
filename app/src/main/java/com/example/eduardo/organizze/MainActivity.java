package com.example.eduardo.organizze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.eduardo.organizze.activity.CadastroActivity;
import com.example.eduardo.organizze.activity.LoginActivity;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //Remover isto, pois não é mais necessário

        //Remoção dos buttões de navegação
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //Add sliders
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .canGoBackward(false)
                .canGoForward(false) //Resolver problema de fechar app ao passar todas as telas
                .build()
        );
    }

    public void btEntrar(View v){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View v){
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
