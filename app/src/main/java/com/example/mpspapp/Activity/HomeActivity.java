package com.example.mpspapp.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.mpspapp.MainActivity;
import com.example.mpspapp.R;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                /*if(menuItem.getItemId() == R.id.inicioItem){
                    Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else if(menuItem.getItemId() == R.id.buscarItem){
                    Intent intent = new Intent(HomeActivity.this, BuscarActivity.class);
                    startActivity(intent);
                }else if(menuItem.getItemId() == R.id.listaItem){
                    Intent intent = new Intent(HomeActivity.this, ListaActivity.class);
                    startActivity(intent);
                }else if(menuItem.getItemId() == R.id.arquivosItem){
                    Intent intent = new Intent(HomeActivity.this, ArquivosActivity.class);
                    startActivity(intent);
                }else if(menuItem.getItemId() == R.id.perfilItem){
                    Intent intent = new Intent(HomeActivity.this, PerfilActivity.class);
                    startActivity(intent);
                }*/

                switch (menuItem.getItemId()) {
                    case R.id.inicioItem:
                        break;
                    case R.id.arquivosItem:
                        Intent a = new Intent(HomeActivity.this,ArquivosActivity.class);
                        startActivity(a);
                        break;
                    case R.id.buscarItem:
                        Intent b = new Intent(HomeActivity.this,BuscarActivity.class);
                        startActivity(b);
                        break;
                    case R.id.listaItem:
                        Intent c = new Intent(HomeActivity.this, ListaActivity.class);
                        startActivity(c);
                        break;
                    case R.id.perfilItem:
                        Intent d = new Intent(HomeActivity.this,PerfilActivity.class);
                        startActivity(d);
                        break;
                }
                return false;
            }
        });
    }
}
