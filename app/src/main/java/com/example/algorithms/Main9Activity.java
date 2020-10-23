package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main9Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        myText=findViewById(R.id.textView3);
        Sort sot3=new Sort(8,"S.S Hospital");
        myList.add(sot3);
        sot3=new Sort(4,"Bhagavathy Hospital");
        myList.add(sot3);
        sot3=new Sort(3,"J.K.Institute of Neurology");
        myList.add(sot3);
        sot3=new Sort(7,"Karthik Hospital");
        myList.add(sot3);
        sot3 =new Sort(6,"Keep Fit Hospital");
        myList.add(sot3);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main9Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
