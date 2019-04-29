package com.ronggolawedeveloper.modernui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegisterActivity;
    private Button btnLoginActivity;
    private Button btnProfilActivity;
    private Button btnProfil2Activity;
    private Button btnModernActivity;
    private Button btnPagiActivity;
    private Button btnProfil3Activity;
    private Button btnProdukActivity;
    private Button btnShareActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register Activity
        btnRegisterActivity = (Button)findViewById(R.id.btn_register);
        btnRegisterActivity.setOnClickListener(this);

        // Login Activity
        btnLoginActivity = (Button)findViewById(R.id.btn_login);
        btnLoginActivity.setOnClickListener(this);

        // Profil Activity
        btnProfilActivity = (Button)findViewById(R.id.btn_profil1);
        btnProfilActivity.setOnClickListener(this);

        // Profil2 Activity
        btnProfil2Activity = (Button)findViewById(R.id.btn_popup);
        btnProfil2Activity.setOnClickListener(this);

        // Modern Activity
        btnModernActivity = (Button)findViewById(R.id.btn_modern);
        btnModernActivity.setOnClickListener(this);

        // Modern Activity
        btnPagiActivity = (Button)findViewById(R.id.btn_weather);
        btnPagiActivity.setOnClickListener(this);

        // Profil3 Activity
        btnProfil3Activity = (Button)findViewById(R.id.btn_profil3);
        btnProfil3Activity.setOnClickListener(this);

        // Profil3 Activity
        btnProdukActivity = (Button)findViewById(R.id.btn_produk);
        btnProdukActivity.setOnClickListener(this);

        // Share Activity
        btnShareActivity = (Button)findViewById(R.id.btn_share);
        btnShareActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_register:
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
                break;
            case R.id.btn_login:
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                break;
            case R.id.btn_profil1:
                Intent profil1Intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(profil1Intent);
                break;
            case R.id.btn_popup:
                Intent profil21Intent = new Intent(MainActivity.this, Profil2Activity.class);
                startActivity(profil21Intent);
                break;
            case R.id.btn_modern:
                Intent modernIntent = new Intent(MainActivity.this, ModernActivity.class);
                startActivity(modernIntent);
                break;
            case R.id.btn_weather:
                Intent weatherIntent = new Intent(MainActivity.this, PagiActivity.class);
                startActivity(weatherIntent);
                break;
            case R.id.btn_profil3:
                Intent profil3Intent = new Intent(MainActivity.this, Profil3Activity.class);
                startActivity(profil3Intent);
                break;
            case R.id.btn_produk:
                Intent produkIntent = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(produkIntent);
                break;
            case R.id.btn_share:
                Intent shareIntent = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(shareIntent);
                break;
        }
    }
}
