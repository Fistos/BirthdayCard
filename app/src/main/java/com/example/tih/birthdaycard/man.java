package com.example.tih.birthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class man extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
    }
    public void woman1(View v) {
        Intent Woman = new Intent(man.this, MainActivity.class);
        startActivity(Woman);
    }
}
