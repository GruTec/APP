package com.example.mpspapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mpspapp.Activity.LoginActivity;
import com.example.mpspapp.Fragment.ArquivoFragment;
import com.example.mpspapp.Fragment.HomeFragment;
import com.example.mpspapp.Fragment.ListaFragment;
import com.example.mpspapp.Fragment.PerfilFragment;
import com.example.mpspapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}