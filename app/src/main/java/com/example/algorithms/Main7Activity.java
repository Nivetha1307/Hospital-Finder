package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main7Activity extends AppCompatActivity {
    TextView myText;
    TextView click;
    List<Sort> myList=new ArrayList<Sort>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        myText=findViewById(R.id.textView3);
        Sort sot2=new Sort(5,"Agarwal Hospital");
        myList.add(sot2);
        sot2=new Sort(8,"Thembavani Hospital");
        myList.add(sot2);
        sot2=new Sort(4,"Rajamani Hospital");
        myList.add(sot2);
        sot2=new Sort(7,"Victory Hospital");
        myList.add(sot2);
        sot2 =new Sort(9,"Jebam Hospital");
        myList.add(sot2);
        Collections.sort(myList);
        showList();
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main7Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
