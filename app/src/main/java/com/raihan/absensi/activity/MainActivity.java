package com.raihan.absensi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.raihan.absensi.R;

public class MainActivity extends AppCompatActivity {

    private Button scan, daftar, cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.btn_scan);

        daftar = findViewById(R.id.btn_daftar);

        cloud = findViewById(R.id.btn_cloud);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ketika tombol scan ditekan apa yang terjadi
                //ke halaman scan
                startActivity(new Intent(MainActivity.this, ScanActivity.class));
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ketika tombol daftar ditekan apa yang terjadi
                //ke halaman daftar hadir
                startActivity(new Intent(MainActivity.this, DaftarActivity.class));
            }
        });

        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ketika tombol daftar ditekan apa yang terjadi
                //ke halaman daftar hadir
                startActivity(new Intent(MainActivity.this, DaftarCloudActivity.class));
            }
        });
    }
}