package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main24Activity extends AppCompatActivity {
    TextView myText;
    List<Item> myList=new ArrayList<Item>();
    Button sort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        myText=findViewById(R.id.textView3);
        sort=findViewById(R.id.sort);
        Item sot=new Item(10,"Krithika Hospital");
        myList.add(sot);
        sot=new Item(6,"Mahalingam Hospital");
        myList.add(sot);
        sot=new Item(8,"Nadar Hospital");
        myList.add(sot);
        sot=new Item(15,"Raajathi Hospital");
        myList.add(sot);
        sot =new Item(7,"Baskar Hospital");
        myList.add(sot);

        showList();
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main24Activity.this,Main13Activity.class);
                startActivity(intent);
            }
        });
    }
    private void showList() {
        for(Item tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
