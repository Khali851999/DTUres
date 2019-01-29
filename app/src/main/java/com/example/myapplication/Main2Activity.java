package com.example.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
        androidFlavors.add(new AndroidFlavor("PHSICS", "basic physics",0));
        androidFlavors.add(new AndroidFlavor("CHEMISTRY", "basic chem", 0));
        androidFlavors.add(new AndroidFlavor("MATHS", "maths", 0));
        androidFlavors.add(new AndroidFlavor("ELECTRICAL", "electrical ", 0));
        androidFlavors.add(new AndroidFlavor("BME", "bme", 0));
        androidFlavors.add(new AndroidFlavor("ED", "ed", 0));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        final ListView listView = findViewById(R.id.simpleListView);
        listView.setAdapter(flavorAdapter);

             listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = i;
                String val =listView.getItemAtPosition(i).toString();
                if (pos == 0) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent);
                }

                else if (pos == 1) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent1);

                }
                else if (pos == 2) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent2);

                }
                else if (pos == 3) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent3);

                }
                if (pos == 4) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent4);

                }
                else if (pos == 5) {
                    Toast.makeText(Main2Activity.this, "OPENING", Toast.LENGTH_SHORT).show();
                    Intent intent5 = new Intent(Main2Activity.this,PHYSICSDOC.class);
                    startActivity(intent5);

                }
            }
        });


}
    }
