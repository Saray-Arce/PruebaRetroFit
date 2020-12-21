package com.example.pruebaretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import classes.User;
import interfaces.UserInterface;
import retrofit.UserAPIClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPasswd;

    private Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText) findViewById( R.id.txtUser);
        txtPasswd = (EditText) findViewById( R.id.txtPasswd);

        btnSignIn = (Button) findViewById( R.id.button1);
        btnSignIn.setText( R.string.btnAccept);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                UserInterface userInterface = UserAPIClient.findUserByLoginAndPasswd( txtUser.getText().toString(), txtPasswd.getText().toString());

                Call<User> call = (Call<User>) userInterface.find(new Integer(1));

                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {

                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });
                Toast.makeText(getApplicationContext(), "Ha ocurrido un error!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}