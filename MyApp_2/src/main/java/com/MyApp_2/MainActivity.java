package com.MyApp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.et);
    }

    @Override
    public void onClick(View view) {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(),"custum");
    }
}
