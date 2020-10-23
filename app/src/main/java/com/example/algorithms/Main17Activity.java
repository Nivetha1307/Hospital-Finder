package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main17Activity extends AppCompatActivity {

    TextView myText;
    List<Item> myList=new ArrayList<Item>();
    Button sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
       // mapview=findViewById(R.id.textView10);
        myText=findViewById(R.id.textView3);
        sort=findViewById(R.id.sort);
        Item sot=new Item(2,"Aravind Eye Hospital");
        myList.add(sot);
        sot=new Item(4,"Vickram Hospital");
        myList.add(sot);
        sot=new Item(3,"Apollo Hospital");
        myList.add(sot);
        sot=new Item(7,"Kiruba Hospital");
        myList.add(sot);
        sot =new Item(5,"S.P.Hospital");
        myList.add(sot);

        showList();
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main17Activity.this,Main6Activity.class);
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
