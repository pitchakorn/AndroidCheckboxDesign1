package com.example.topnt.androidcheckboxdesign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatCheckBox checkBox1 , checkBox2 , checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (AppCompatCheckBox) findViewById(R.id.checkbox1_id);
        checkBox2 = (AppCompatCheckBox) findViewById(R.id.checkbox2_id);
        checkBox3 = (AppCompatCheckBox) findViewById(R.id.checkbox3_id);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean state) {
                if (state){
                    Toast.makeText(MainActivity.this, "Check Box1 Checked", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Check Box1 Unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean state) {
                if (state){
                    Toast.makeText(MainActivity.this, "Check Box2 Checked", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Check Box2 Unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean state) {
                if (state){
                    Toast.makeText(MainActivity.this, "Check Box3 Checked", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Check Box3 Unchecked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
