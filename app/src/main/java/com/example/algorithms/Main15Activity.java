package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main15Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        myText=findViewById(R.id.textView3);
        Sort sot9=new Sort(3,"Vellamal Hospital");
        myList.add(sot9);
        sot9=new Sort(2,"Thanvanthri Hospital");
        myList.add(sot9);
        sot9=new Sort(8,"Ramya Hospital");
        myList.add(sot9);
        sot9=new Sort(6,"Sandhya Hospital");
        myList.add(sot9);
        sot9 =new Sort(5,"Jeyam Hospital");
        myList.add(sot9);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main15Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
