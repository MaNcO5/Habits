package com.example.manco.habits;

import android.content.DialogInterface;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity implements View.OnClickListener{
    private SignIn Googleclient;
    Button signIn;
    EditText Email_text, Password_text;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Email_text = (EditText) findViewById(R.id.Email_text);
        Password_text = (EditText) findViewById(R.id.Password_text);
        signIn = (Button) findViewById(R.id.signIn);
        
        signIn.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);


           }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.signIn:
                User user = new User(null,null);

                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);

                break;
        }
    }


}
