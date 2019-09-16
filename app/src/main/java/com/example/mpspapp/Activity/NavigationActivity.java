package com.example.mpspapp.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mpspapp.Fragment.ArquivoFragment;
import com.example.mpspapp.Fragment.HomeFragment;
import com.example.mpspapp.Fragment.ListaFragment;
import com.example.mpspapp.Fragment.PerfilFragment;
import com.example.mpspapp.R;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView  bottom = findViewById(R.id.bottom_navigation);
        bottom.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment frag = null;

                    switch (item.getItemId()){
                        case R.id.inicioItem:
                            frag = new HomeFragment();
                            break;
                        case R.id.arquivosItem:
                            frag = new ArquivoFragment();
                            break;
                        case R.id.listaItem:
                            frag = new ListaFragment();
                            break;
                        case R.id.perfilItem:
                            frag = new PerfilFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, frag).commit();
                    return  true;
                }
            };
}