package com.example.user.loginimp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image2);
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        ImageAdapter2 adapter=new ImageAdapter2(this);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);
    }
}

