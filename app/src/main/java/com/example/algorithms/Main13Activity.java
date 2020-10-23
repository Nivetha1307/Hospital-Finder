package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main13Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        myText=findViewById(R.id.textView3);
        Sort sot7=new Sort(10,"Krithika Hospital");
        myList.add(sot7);
        sot7=new Sort(6,"Mahalingam Hospital");
        myList.add(sot7);
        sot7=new Sort(8,"Nadar Hospital");
        myList.add(sot7);
        sot7=new Sort(15,"Raajathi Hospital");
        myList.add(sot7);
        sot7 =new Sort(7,"Baskar Hospital");
        myList.add(sot7);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main13Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
