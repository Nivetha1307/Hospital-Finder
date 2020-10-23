package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main20Activity extends AppCompatActivity {
    TextView myText;
    List<Item> myList=new ArrayList<Item>();
    Button sort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        myText=findViewById(R.id.textView3);
        sort=findViewById(R.id.sort);
        Item sot=new Item(8,"S.S Hospital");
        myList.add(sot);
        sot=new Item(4,"Bhagavathy Hospital");
        myList.add(sot);
        sot=new Item(3,"J.K.Institute of Neurology");
        myList.add(sot);
        sot=new Item(7,"Karthik Hospital");
        myList.add(sot);
        sot =new Item(6,"Keep Fit Hospital");
        myList.add(sot);

        showList();
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main20Activity.this,Main9Activity.class);
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
