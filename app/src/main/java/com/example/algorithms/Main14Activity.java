package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main14Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        myText=findViewById(R.id.textView3);
        Sort sot8=new Sort(9,"Preethi Hospital");
        myList.add(sot8);
        sot8=new Sort(6,"Meenachi Mission Hospital");
        myList.add(sot8);
        sot8=new Sort(5,"Sri Kamathi Subam Hospital");
        myList.add(sot8);
        sot8=new Sort(1,"Eagle Siddha Hospital");
        myList.add(sot8);
        sot8 =new Sort(7,"Annai Hospital");
        myList.add(sot8);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main14Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
