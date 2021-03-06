package br.edu.ifsp.petfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.petfood.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openAutentication();
            }
        }, 3000);
    }


    private void openAutentication(){
        Intent i = new Intent(SplashActivity.this, AuthenticationActivity.class);
                startActivity(i);
                finish();
    }
}