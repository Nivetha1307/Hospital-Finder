package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {


    SearchView mySearchView;
    ListView myList;
    EditText km;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView) findViewById(R.id.mylist);



        list=new ArrayList<String>();

        list.add("Anna Nagar");
        list.add("Aarapalayam");
        list.add("Goripalayam");
        list.add("Thirunagar");
        list.add("Krishnapuram colony");
        list.add("Pudhur");
        list.add("Sandhaipettai");
        list.add("Munichaalai");
        list.add("Uthangudi");
        list.add("Sindhamani");







        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                validate(mySearchView.getQuery().toString());

                return true;
            }


            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }
        });





        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=String.valueOf(parent.getItemAtPosition(position));

                if(s.equals("Anna Nagar") ){
                    Intent i=new Intent(Main5Activity.this,Main17Activity.class);
                    startActivity(i);
                }
                if(s.equals("Aarapalayam")){
                    Intent i=new Intent(Main5Activity.this,Main18Activity.class);
                    startActivity(i);
                }
                if(s.equals("Goripalayam")){
                    Intent i=new Intent(Main5Activity.this,Main19Activity.class);
                    startActivity(i);
                }
                if(s.equals("Thirunagar")){
                    Intent i=new Intent(Main5Activity.this,Main20Activity.class);
                    startActivity(i);
                }
                if(s.equals("Krishnapuram colony")){
                    Intent i=new Intent(Main5Activity.this,Main21Activity.class);
                    startActivity(i);
                }
                if(s.equals("Pudhur")){
                    Intent i=new Intent(Main5Activity.this,Main22Activity.class);
                    startActivity(i);
                }
                if(s.equals("Sandhaipettai")){
                    Intent i=new Intent(Main5Activity.this,Main23Activity.class);
                    startActivity(i);
                }
                if (s.equals("Munichaalai"))
                {
                    Intent i=new Intent(Main5Activity.this,Main24Activity.class);
                    startActivity(i);
                }
                if (s.equals("Uthangudi"))
                {
                    Intent i=new Intent(Main5Activity.this,Main25Activity.class);
                    startActivity(i);
                }
                if (s.equals("Sindhamani"))
                {
                    Intent i=new Intent(Main5Activity.this,Main26Activity.class);
                    startActivity(i);
                }

            }
        });
    }


    public void validate(String name)
    {
        if (name.equals("Anna nagar"))
        {

            Intent i=new Intent(Main5Activity.this,Main17Activity.class);
            startActivity(i);
        }
        if(name.equals("Aarapalayan")){
            Intent i = new Intent(Main5Activity.this,Main18Activity.class);
            startActivity(i);
        }
        if(name.equals("Goripalayam")){
            Intent i = new Intent(Main5Activity.this, Main19Activity.class);
            startActivity(i);
        }
        if(name.equals("Thirunagar"))

        {
            Intent i =new Intent(Main5Activity.this,Main20Activity.class);
            startActivity(i);
        }
        if(name.equals("Krishnapuram colony")){
            Intent i=new Intent(Main5Activity.this,Main21Activity.class);
            startActivity(i);
        }
        if (name.equals("Pudhur")){
            Intent i=new Intent(Main5Activity.this,Main22Activity.class);
            startActivity(i);
        }
        if(name.equals("Sandhaipettai")){
            Intent i=new Intent(Main5Activity.this,Main23Activity.class);
            startActivity(i);
        }
        if(name.equals("Munichaalai")){
            Intent i =new Intent(Main5Activity.this,Main24Activity.class);
            startActivity(i);
        }
        if(name.equals("Uthangudi")){
            Intent i=new Intent(Main5Activity.this,Main25Activity.class);
            startActivity(i);
        }
        if(name.equals("Sindhamani")){
            Intent i=new Intent(Main5Activity.this,Main26Activity.class);
            startActivity(i);
        }

    }    }

