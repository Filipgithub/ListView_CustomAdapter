package com.example.uino.listview_customadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = (TextView)findViewById(R.id.textView);
        Person person= (Person) getIntent().getSerializableExtra("extra");
        textView.setText(person.toString());
     /*   String s = getIntent().getStringExtra("extra");
        textView.setText(s);*/

    }
}
