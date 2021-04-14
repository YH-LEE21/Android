package com.example.a1812069;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.btn1);
        ImageView img1 = (ImageView) findViewById(R.id.ImageView3);
        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(Intent.ACTION_VIEW,Uri.parse("https://line.me/ja/"));
                startActivity(it);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"git hub",Toast.LENGTH_SHORT).show();
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/YH-LEE21/Programmers"));
                startActivity(it);
                finish();
            }
        });
    }
}
