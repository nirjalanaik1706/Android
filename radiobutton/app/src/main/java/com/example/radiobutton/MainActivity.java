package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView TextView;
    RadioGroup rbg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView =(TextView) findViewById(R.id.text);
        rbg=(RadioGroup)findViewById(R.id.rgb);
    }
    public void onClick(View V) {
        int id = rbg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(id);
        String str = (String) rb.getText();

        Toast t = Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG);
        t.show();
    }
}