package com.example.udemyselectioncontrols;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.SwitchCompat;

import android.widget.RadioGroup;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat switchCompat;
    AppCompatCheckBox checkBox;
    AppCompatRadioButton radioButton;
    RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switch_id);
        checkBox = findViewById(R.id.checkbox_id);
        radioButton = findViewById(R.id.radioButton1);
        radioGroup = findViewById(R.id.radioGroup_id);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Switch OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "CheckBox is Enable", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "CheckBox is Disable", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println(b);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){
                    case R.id.radioGroupButton1:
                        Toast.makeText(MainActivity.this, "Radio Group Button 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioGroupButton2:
                        Toast.makeText(MainActivity.this, "Radio Group Button 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioGroupButton3:
                        Toast.makeText(MainActivity.this, "Radio Group Button 3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }//The last method onCreate
}//The last Class MainActivity
