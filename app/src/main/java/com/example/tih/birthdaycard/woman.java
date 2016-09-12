package com.example.tih.birthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class woman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman);
    }

    public void woman1(View v) {
        Intent Woman = new Intent(woman.this, MainActivity.class);
        startActivity(Woman);
    }
}
