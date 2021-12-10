package com.example.edt48;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private TextView text;
    private TextView desc;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        text = findViewById(R.id.detailText1);
        desc = findViewById(R.id.detailText2);
        img = findViewById(R.id.imgDetail);

        String sText, sDesc, sImg;

        sText = getIntent().getStringExtra("text");
        sDesc = getIntent().getStringExtra("desc");
        sImg = getIntent().getStringExtra("url");

        text.setText(sText);
        desc.setText(sDesc);

        Picasso.get().load(sImg).fit().centerCrop().into(img);


    }

}