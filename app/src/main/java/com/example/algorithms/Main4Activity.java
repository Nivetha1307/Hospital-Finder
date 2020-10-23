package com.example.algorithms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Main4Activity extends AppCompatActivity {

     private EditText passwordEmail;
     private Button resetPassword;
     private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        passwordEmail=(EditText)findViewById(R.id.etemailreset);
        resetPassword=(Button)findViewById(R.id.btResetPassword);
        firebaseAuth=FirebaseAuth.getInstance();
        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String useremail=passwordEmail.getText().toString().trim();
            if (useremail.equals(" ")){
                Toast.makeText(Main4Activity.this,"Please enter your registered email ID",Toast.LENGTH_SHORT).show();

            }else {
                firebaseAuth.sendPasswordResetEmail(useremail).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Main4Activity.this,"Password reset email sent",Toast.LENGTH_SHORT).show();
                            finish();
                            startActivity(new Intent(Main4Activity.this,MainActivity.class));
                        }else {
                            Toast.makeText(Main4Activity.this,"Error in sending password reset",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
            }
        });
    }
}
