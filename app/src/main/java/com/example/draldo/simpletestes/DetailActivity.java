package com.example.draldo.simpletestes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        StringBuilder stringBuilder = new StringBuilder(text).reverse();

        mTextView = (TextView) findViewById(R.id.a_detail_text);
        mTextView.setText(stringBuilder.toString());
    }

}
