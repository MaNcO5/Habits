package com.example.manco.habits;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registry extends AppCompatActivity implements View.OnClickListener{
    Button Register;
    EditText FirstName, LastName, Email_text, Password_text, Password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);

        FirstName = (EditText) findViewById(R.id.FirstName);
        LastName = (EditText) findViewById(R.id.LastName);
        Email_text = (EditText) findViewById(R.id.Email_text);
        Password_text = (EditText) findViewById(R.id.Password_text);
        Password2 = (EditText) findViewById(R.id.Password2);
        Register = (Button) findViewById(R.id.Register);

        Register.setOnClickListener(this);


    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.register_button:
                String name = FirstName.getText().toString();
                String username = LastName.getText().toString();
                String email = Email_text.getText().toString();
                String password = Password_text.getText().toString();
                String password2 = Password2.getText().toString();

                User registredData = new User(name, username, password, password2, email);

                break;
        }
    }

}
