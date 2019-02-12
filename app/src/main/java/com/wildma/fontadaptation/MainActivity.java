package com.wildma.fontadaptation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToFontAdaptationScene1Activity(View view) {
        startActivity(new Intent(this, FontAdaptationScene1Activity.class));
    }

    public void jumpToFontAdaptationScene2ErrorActivity(View view) {
        startActivity(new Intent(this, FontAdaptationScene2ErrorActivity.class));
    }

    public void jumpToFontAdaptationScene2Activity(View view) {
        startActivity(new Intent(this, FontAdaptationScene2Activity.class));
    }

    public void jumpToFontAdaptationScene3Activity(View view) {
        startActivity(new Intent(this, FontAdaptationScene3Activity.class));
    }
}
