package com.example.draldo.simpletestes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.a_main_text);
    }

    public void doMagic(View view) {
        Intent intent = new Intent(this,DetailActivity.class);
        String text = mEditText.getText().toString();

        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(intent);
    }
}
