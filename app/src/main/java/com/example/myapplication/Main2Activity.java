package com.example.myapplication;

import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"PHYSICS", "CHEMISTRY", "MATHS", "ELECTRICAL", "BME", "COMPUTER FUNDAMENTALS"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        simpleList = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = i;
                String val = simpleList.getItemAtPosition(i).toString();
                if (pos == 0) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main2Activity.this,mainpage.class);

                }

                else if (pos == 1) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent1);

                }
                else if (pos == 2) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent2);

                }
                else if (pos == 3) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent3);

                }
                if (pos == 4) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent4);

                }
                else if (pos == 5) {
                    Toast.makeText(Main2Activity.this, "YOU CLICKED ON " + val, Toast.LENGTH_SHORT).show();
                    Intent intent5 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent5);

                }
            }
        });


}
    }
