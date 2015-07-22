package com.osahub.rachit.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup gender;
    RadioButton selectedGender;
    Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = (RadioGroup) findViewById(R.id.gender);
        select = (Button) findViewById(R.id.select);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedGenderID = gender.getCheckedRadioButtonId();

                selectedGender = (RadioButton) findViewById(selectedGenderID);

                Toast.makeText(getApplicationContext(), selectedGender.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
