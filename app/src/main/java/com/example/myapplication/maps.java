package com.example.myapplication;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
        androidFlavors.add(new AndroidFlavor("DTU", "", 0));
        androidFlavors.add(new AndroidFlavor("Ground", "", 0));
        androidFlavors.add(new AndroidFlavor("Library", "", 0));
        androidFlavors.add(new AndroidFlavor("Sports Complex", " ", 0));
        androidFlavors.add(new AndroidFlavor("Mic Mac", "", 0));
        androidFlavors.add(new AndroidFlavor("Maggi Baba", "", 0));
        androidFlavors.add(new AndroidFlavor("Post Office", "", 0));
        androidFlavors.add(new AndroidFlavor("Gym", "", 0));
        androidFlavors.add(new AndroidFlavor("SBI", "", 0));
        androidFlavors.add(new AndroidFlavor("Canteen", " ", 0));
        androidFlavors.add(new AndroidFlavor("Amul", "", 0));
        androidFlavors.add(new AndroidFlavor("Nescafe", "", 0));
        androidFlavors.add(new AndroidFlavor("Stationary", "", 0));
        androidFlavors.add(new AndroidFlavor("BR Ambedkar Audi", "", 0));
        androidFlavors.add(new AndroidFlavor("Smart ", "", 0));
        androidFlavors.add(new AndroidFlavor("Computer Center", " ", 0));
        androidFlavors.add(new AndroidFlavor("Mic Mac", "", 0));
        androidFlavors.add(new AndroidFlavor("Maggi Baba", "", 0));
        androidFlavors.add(new AndroidFlavor("Post Office", "", 0));
        androidFlavors.add(new AndroidFlavor("Gym", "", 0));
        androidFlavors.add(new AndroidFlavor("SBI", "", 0));
        androidFlavors.add(new AndroidFlavor("Canteen", "", 0));
        androidFlavors.add(new AndroidFlavor("Amul", "", 0));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        final ListView listView = findViewById(R.id.simpleListView1);
        listView.setAdapter(flavorAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = i;
                String val =listView.getItemAtPosition(i).toString();
                if (pos == 0) {
                    Intent i0=new Intent(Intent.ACTION_VIEW);
                    i0.setData(Uri.parse("http://maps.google.com/maps?q=28.750069,77.117668(Label Point"));
                    startActivity(i0); }
                else if (pos == 1) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.750623,77.116647(Label Point"));
                    startActivity(i1); }
                else if (pos == 2) {
                    Intent i2=new Intent(Intent.ACTION_VIEW);
                    i2.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i2); }
                else if (pos == 3) {
                    Intent i3=new Intent(Intent.ACTION_VIEW);
                    i3.setData(Uri.parse("http://maps.google.com/maps?q=28.752029,77.116738(Label Point"));
                    startActivity(i3); }
                else if (pos == 4) {
                    Intent i4=new Intent(Intent.ACTION_VIEW);
                    i4.setData(Uri.parse("http://maps.google.com/maps?q=28.751089,77.115643(Label Point"));
                    startActivity(i4); }
                else if (pos == 5) {
                    Intent i5=new Intent(Intent.ACTION_VIEW);
                    i5.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i5); }
                else if (pos == 6) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 7) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 8) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 9) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 10) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 11) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
                else if (pos == 12) {
                    Intent i1=new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("http://maps.google.com/maps?q=28.753567,77.115853(Label Point"));
                    startActivity(i1); }
            }
        });

//
    }}