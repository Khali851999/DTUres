package com.example.myapplication;

import android.app.ActivityOptions;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
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
    DownloadManager downloadManager;

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
                    Toast.makeText(Main2Activity.this, "DOWNLOADING ", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }

                else if (pos == 1) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                else if (pos == 2) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                else if (pos == 3) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                if (pos == 4) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                else if (pos == 5) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                else if (pos == 6) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
                else if (pos == 7) {
                    Toast.makeText(Main2Activity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();
                    downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri =Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-3ecd8.appspot.com/o/New%20Doc%202018-08-08_3.pdf?alt=media&token=7c78c5c9-c9ee-4e18-a934-0cbb08996aab");
                    DownloadManager.Request request= new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference=downloadManager.enqueue(request);
                }
            }
        });


}
    }
