package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main8Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        myText=findViewById(R.id.textView3);
        Sort sot1=new Sort(1,"Government Hospital");
        myList.add(sot1);
        sot1=new Sort(4,"Booma Hospital");
        myList.add(sot1);
        sot1=new Sort(9,"Kumaran Hospital");
        myList.add(sot1);
        sot1=new Sort(7,"City Hospital");
        myList.add(sot1);
        sot1 =new Sort(5,"Jawahar Hospital");
        myList.add(sot1);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main8Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}

