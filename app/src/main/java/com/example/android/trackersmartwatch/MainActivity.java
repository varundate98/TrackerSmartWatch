package com.example.android.trackersmartwatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText) findViewById(R.id.username);
        String userName = name.getText().toString();

        EditText pass = (EditText) findViewById(R.id.password);
        String password = pass.getText().toString();
    }

    public void signUp (View view){
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
    }

    public void signIn (View view){
        EditText name = (EditText) findViewById(R.id.username);
        String userName = name.getText().toString();

        EditText pass = (EditText) findViewById(R.id.password);
        String password = pass.getText().toString();

        Log.v("MainActivity","Username : " + userName);
        Log.v("MainActivity","Password : " + password);
        if (userName.equals("username") && password.equals("password") ){
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
        }

        else {
            Toast.makeText(this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
        }
    }

    public void forgotPassword (View view){
        Intent i = new Intent(this, ForgotPasswordActivity.class);
        startActivity(i);
    }
}
