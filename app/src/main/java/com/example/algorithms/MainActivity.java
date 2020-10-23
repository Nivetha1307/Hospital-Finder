package com.example.algorithms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
 private EditText Name;
 private EditText Password;
 private TextView info;
 private Button Login;
 private TextView Signup;
 //private TextView userRegistration;
 private FirebaseAuth firebaseAuth;
 private ProgressDialog progressDialog;
 private TextView forgotpassword;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.etname);
        Password=(EditText) findViewById(R.id.etpassword);
        Login=(Button)findViewById(R.id.button11);
        Signup=(TextView)findViewById(R.id.tvregister);
        forgotpassword=(TextView)findViewById(R.id.tvForgotPassword);

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main4Activity.class));
            }
        });
      //  userRegistration=(TextView)findViewById(R.id.tvregister);
   firebaseAuth=FirebaseAuth.getInstance();
      progressDialog =new ProgressDialog(this);
      //  FirebaseUser user=firebaseAuth.getCurrentUser();
        //if (user!=null){
          //  finish();
            //startActivity(new Intent(MainActivity.this,Main2Activity.class));
        //}

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }
    private void validate(String userName,String userPassword){
        progressDialog.setMessage("You can ");
        progressDialog.show();
         firebaseAuth.signInWithEmailAndPassword(userName,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           //  @Override
             public void onComplete(@NonNull Task<AuthResult> task) {
              if (task.isSuccessful()){
                  progressDialog.dismiss();
                  Toast.makeText(MainActivity.this,"Login  Successful",Toast.LENGTH_SHORT).show();
                  startActivity(new Intent(MainActivity.this,Main2Activity.class));
              }else {
                  Toast.makeText(MainActivity.this,"Login  Failed",Toast.LENGTH_SHORT).show();
                  progressDialog.dismiss();
              }
             }
         });
    }
}
