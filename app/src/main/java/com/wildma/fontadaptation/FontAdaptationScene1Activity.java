package com.wildma.fontadaptation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Author       wildma
 * Github       https://github.com/wildma
 * Desc	        ${字体适配场景一（动态改变TextView字体大小）}
 */
public class FontAdaptationScene1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_adaptation_scene_1);

        /*代码中动态改变TextView字体大小*/
        /*TextView tvText = findViewById(R.id.tv_text);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(tvText, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(tvText, 10, 18, 1, TypedValue.COMPLEX_UNIT_SP);*/
    }
}
