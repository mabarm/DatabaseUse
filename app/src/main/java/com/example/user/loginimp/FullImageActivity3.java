package com.example.user.loginimp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image3);
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        ImageAdapter3 adapter=new ImageAdapter3(this);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);
    }
}

