package com.example.algorithms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private Button logout;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firebaseAuth=FirebaseAuth.getInstance();
      logout=(Button)findViewById(R.id.btlogout);
      click=(Button) findViewById(R.id.btclick);
      click.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(Main2Activity.this,Main5Activity.class));
          }
      });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
                Toast.makeText(Main2Activity.this,"Logout succesfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(Main2Activity.this,MainActivity.class));
        Toast.makeText(Main2Activity.this,"Logout succesfully",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logoutMenu:
                Logout();

        }
        return super.onOptionsItemSelected(item);
    }
}
