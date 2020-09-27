package com.Lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ArrayList <TextView> list = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add ((TextView) findViewById(R.id.textView1));
        list.add ((TextView) findViewById(R.id.textView2));
        list.add ((TextView) findViewById(R.id.textView3));

        for (TextView tv:list) tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(),"custum");
    }
}
