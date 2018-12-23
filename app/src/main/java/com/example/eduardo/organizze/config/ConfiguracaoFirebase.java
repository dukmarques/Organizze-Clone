package com.example.eduardo.organizze.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {
    private static FirebaseAuth autenticacao;

    //Retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){
        if (autenticacao == null){
           autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
