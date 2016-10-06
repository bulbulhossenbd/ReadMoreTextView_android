package com.example.bulbulhossen.readmoretextview_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.borjabravo.readmoretextview.ReadMoreTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReadMoreTextView text1 = (ReadMoreTextView) findViewById(R.id.text1);
        text1.setText(getString(R.string.lorem_ipsum));
        ReadMoreTextView text2 = (ReadMoreTextView) findViewById(R.id.text2);
        text2.setText(getString(R.string.lorem_ipsum));
        ReadMoreTextView text3 = (ReadMoreTextView) findViewById(R.id.text3);
        text3.setText(getString(R.string.lorem_ipsum));
        ReadMoreTextView text4 = (ReadMoreTextView) findViewById(R.id.demotext);
        text4.setText(getString(R.string.lorem_ipsum));
    }
}
