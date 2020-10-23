package com.example.algorithms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main3Activity extends AppCompatActivity {

    private EditText username,userpassword,useremail;
    private Button regButton;
    private TextView userLogin;
    private FirebaseAuth firebaseAuth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setupUIViews();
        firebaseAuth=FirebaseAuth.getInstance();
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( validate()){
                   String user_email=useremail.getText().toString().trim();
                   String user_password=userpassword.getText().toString().trim();
                   firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           if (task.isSuccessful()) {
                               Toast.makeText(Main3Activity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                               startActivity(new Intent(Main3Activity.this,MainActivity.class));
                           }else {
                               Toast.makeText(Main3Activity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                           }
                       }
                   });
               }
            }
        });
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this,MainActivity.class));
            }
        });
    }
    private void setupUIViews(){
        username=(EditText)findViewById(R.id.etusername);
        userpassword=(EditText)findViewById(R.id.etuserpassword);
        useremail=(EditText)findViewById(R.id.etemail);
        regButton=(Button) findViewById(R.id.button12);
        userLogin=(TextView)findViewById(R.id.tvregister);
    }
    private Boolean validate(){
        Boolean result=false;
        String name=username.getText().toString();
        String password=userpassword.getText().toString();
        String email=useremail.getText().toString();
        if(name.isEmpty() &&  password.isEmpty() && email.isEmpty()){
            Toast.makeText(this,"Please enter all the details",Toast.LENGTH_SHORT).show();

        }else {
            result =true;

        }
        return result;
    }
}
