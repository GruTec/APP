package com.example.mpspapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.example.mpspapp.R;

public class BuscarActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.buscarItem:
                        break;
                    case R.id.arquivosItem:
                        Intent a = new Intent(BuscarActivity.this,ArquivosActivity.class);
                        startActivity(a);
                        break;
                    case R.id.inicioItem:
                        Intent b = new Intent(BuscarActivity.this,HomeActivity.class);
                        startActivity(b);
                        break;
                    case R.id.listaItem:
                        Intent c = new Intent(BuscarActivity.this, ListaActivity.class);
                        startActivity(c);
                        break;
                    case R.id.perfilItem:
                        Intent d = new Intent(BuscarActivity.this,PerfilActivity.class);
                        startActivity(d);
                        break;
                }
                return false;
            }
        });
    }
}
