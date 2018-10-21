package com.oops.pk.beginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cardview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        Intent intent=getIntent();
        String word=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView display=findViewById(R.id.textView2);
        display.setText("Definition: "+word);
    }
}
