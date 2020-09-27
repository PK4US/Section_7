package com.MyApp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.et);
        Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int num = Integer.parseInt(editText.getText().toString());
                if (num > 10 || num < 1) {
                    MyDialog myDialog = new MyDialog();
                    myDialog.show(getSupportFragmentManager(),"custum");
                }else {
                    textView.setText(editText.getText());
                }
            }
        });
    }
}
