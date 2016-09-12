package com.example.tih.birthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void woman1(View v){
        Intent Woman = new Intent(MainActivity.this,woman.class);
        startActivity(Woman);
    }
    public void man1(View v){
        Intent Man = new Intent(MainActivity.this,man.class);
        startActivity(Man);
    }
}
