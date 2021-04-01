package br.edu.ifsp.petfood.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.edu.ifsp.petfood.R;

public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        getSupportActionBar().hide();
    }
}