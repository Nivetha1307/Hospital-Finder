package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main11Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        myText=findViewById(R.id.textView3);
        Sort sot5=new Sort(8,"Sumathi Hospital");
        myList.add(sot5);
        sot5=new Sort(9,"Christian Mission Hospital");
        myList.add(sot5);
        sot5=new Sort(10,"Padma Ayurvedha Hospital");
        myList.add(sot5);
        sot5=new Sort(4,"Rajan Hospital");
        myList.add(sot5);
        sot5 =new Sort(12,"Barathi Hospital");
        myList.add(sot5);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main11Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
