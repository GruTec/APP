package com.example.mpspapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mpspapp.Activity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button login;
    private TextView message;
    private int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        login = (Button)findViewById(R.id.button);
        message = (TextView)findViewById(R.id.msg);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarLogin(user.getText().toString(), pass.getText().toString());
            }
        });

        }

    private void validarLogin(String userName, String senha){
        if(userName.equals("admin") && senha.equals("admin")){
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            count--;
            message.setText("Você tem " + count +" tentativas");
            user.setError("Incorreto");
            pass.setError("Incorreto");

            if(count == 0) {
                login.setEnabled(false);
                login.setBackgroundColor(Color.rgb(200,200,200));
                message.setText("Tente novamente mais tarde!");
            }
        }
    }
}