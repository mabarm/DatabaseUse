package com.example.user.loginimp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private Spinner spinner, spinner2;
    private Button button;
    private TextView tv;
    String state[] = null;
    Intent intent;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.btn25);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals g = Globals.getInstance();
                    if(g.getData()==3) {
                      intent = new Intent(Main3Activity.this,QuesActivity3.class);
                        g.setData(0);
                      startActivity(intent);
                  }
                else if(g.getData()==1){

                      intent = new Intent(Main3Activity.this, QuesActivity.class);
                        g.setData(0);
                      startActivity(intent);
            }
                    else if(g.getData()==4){

                        intent = new Intent(Main3Activity.this, QuesActivity4.class);
                        g.setData(0);
                        startActivity(intent);
                    }
                    else if(g.getData()==2){

                        intent = new Intent(Main3Activity.this, QuesActivity2.class);
                        g.setData(0);
                        startActivity(intent);
                    }

        }

    });}




    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        if(arg0.equals(spinner)) {
            int j;
            if(arg2==0){
                state = new String[]{"Subjects"};
            }
            if (arg2 == 1) {
                state = new String[]{"Chem", "Phy"};

            }
            if (arg2 == 2) {
                state = new String[]{"Maths2", "Physi"};
            }
            if (arg2 == 3) {
                state = new String[]{"FC", "DFS"};
            }
            if (arg2 == 4) {
                state = new String[]{"OS", "Java"};
            }
            if (arg2 == 5) {
                state = new String[]{"WT", "TOC"};
            }
            if (arg2 == 6) {
                state = new String[]{"DAA", "CC"};
            }
            if (arg2 == 7) {
                state = new String[]{"XX", "YY"};
            }
            if (arg2 == 8) {
                state = new String[]{"AA", "BB"};
            }


            ArrayAdapter<String> adt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
            spinner2.setAdapter(adt);
        }
        else
            if(arg0.equals(spinner2)){


                    if(spinner2.getSelectedItem().toString().equals("Chem")) {
                        Globals g = Globals.getInstance();
                        g.setData(1);
                    }
                    else if( spinner2.getSelectedItem().toString().equals("Physi")){
                        Globals g = Globals.getInstance();

                        g.setData(2);
                    }
                        else if( spinner2.getSelectedItem().toString().equals("FC")){
                        Globals g = Globals.getInstance();

                        g.setData(3);
                        }
                    else if( spinner2.getSelectedItem().toString().equals("OS")){
                        Globals g = Globals.getInstance();

                        g.setData(4);
                    }
                   }



                }


    public void onNothingSelected(AdapterView<?> arg0) {
    }

    public void onClick(View arg0) {
        String semester = spinner.getSelectedItem().toString();
        final String state = spinner2.getSelectedItem().toString();
        tv.setText(semester + " | " + state);
        }




}



