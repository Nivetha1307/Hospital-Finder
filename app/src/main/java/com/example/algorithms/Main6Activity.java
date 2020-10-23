package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

  TextView myText;
  TextView click;
  TextView mapview;
  List<Sort> myList=new ArrayList<Sort>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        myText=findViewById(R.id.textView3);
        mapview=findViewById(R.id.textView10);
        Sort sot=new Sort(2,"Aravind Eye Hospital");
        myList.add(sot);
        sot=new Sort(4,"Vickram Hospital");
        myList.add(sot);
        sot=new Sort(3,"Apollo Hospital");
        myList.add(sot);
        sot=new Sort(7,"Kiruba Hospital");
        myList.add(sot);
        sot =new Sort(5,"S.P.Hospital");
        myList.add(sot);
        Collections.sort(myList);
        showList();
        mapview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main6Activity.this,MapsActivity.class));
            }
        });
      
        click=findViewById(R.id.textView4);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main6Activity.this,Main16Activity.class));
            }
        });

    }

    private void showList() {
        for(Sort tmp:myList){
            myText.append(tmp.toString() + "\n "+"\n\n\n\n");
        }
    }
}
