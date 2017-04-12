package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

import static com.example.android.quizapp.R.id.editText;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    RadioGroup RadioGroupone, RadioGrouptwo, RadioGroupthree, RadioGroupfour, RadioGroupfive, RadioGroupsix, RadioGroupseven, RadioGroupeight;
    EditText Name;
    CheckBox checkboxStop,checkboxPark,checkboxLoad,checkboxUnload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {
        RadioGroupone = (RadioGroup) findViewById(R.id.radiogroup1);
        int checkedRbIdqone = RadioGroupone.getCheckedRadioButtonId();

        RadioGrouptwo = (RadioGroup) findViewById(R.id.radiogroup2);
        int checkedRbIdqtwo = RadioGrouptwo.getCheckedRadioButtonId();

        RadioGroupthree = (RadioGroup) findViewById(R.id.radiogroup3);
        int checkedRbIdqthree = RadioGroupthree.getCheckedRadioButtonId();

        RadioGroupfour = (RadioGroup) findViewById(R.id.radiogroup4);
        int checkedRbIdqfour = RadioGroupfour.getCheckedRadioButtonId();

        RadioGroupfive = (RadioGroup) findViewById(R.id.radiogroup5);
        int checkedRbIdqfive = RadioGroupfive.getCheckedRadioButtonId();

        RadioGroupsix = (RadioGroup) findViewById(R.id.radiogroup6);
        int checkedRbIdqsix = RadioGroupsix.getCheckedRadioButtonId();

        RadioGroupseven = (RadioGroup) findViewById(R.id.radiogroup7);
        int checkedRbIdqseven = RadioGroupseven.getCheckedRadioButtonId();

        RadioGroupeight = (RadioGroup) findViewById(R.id.radiogroup8);
        int checkedRbIdqeight = RadioGroupeight.getCheckedRadioButtonId();

        Name = (EditText) findViewById(editText);
        String nameenter = Name.getText().toString();
        String answertwo = "Warnings";

        if (checkedRbIdqone == R.id.d) {
            score++;

        }
        if (nameenter.equals(answertwo)) {
            score++;

        }

        checkboxStop = (CheckBox) findViewById(R.id.Stop);
        boolean checkStop = checkboxStop.isChecked();

        checkboxPark = (CheckBox) findViewById(R.id.Park);
        boolean checkPark = checkboxPark.isChecked();

        checkboxLoad = (CheckBox) findViewById(R.id.Load);
        boolean checkLoad = checkboxLoad.isChecked();

        checkboxUnload = (CheckBox) findViewById(R.id.Unload);
        boolean checkUnload = checkboxUnload.isChecked();

        if (checkStop) {
            if (checkPark) {
                if (checkLoad) {
                    if (checkUnload) {
                        score++;
                    }
                }
            }
        }

        if (checkedRbIdqtwo == R.id.a2) {
            score++;

        }

        if (checkedRbIdqthree == R.id.b3) {
            score++;

        }

        if (checkedRbIdqfour == R.id.c4) {
            score++;

        }

        if (checkedRbIdqfive == R.id.b5) {
            score++;

        }
        if (checkedRbIdqsix == R.id.c6) {
            score++;

        }

        if (checkedRbIdqseven == R.id.d7) {
            score++;

        }
        if (checkedRbIdqeight == R.id.d8) {
            score++;
        }


        if(score==10){
        Toast.makeText(this, "WELL DONE! Your score is" + score + "/10", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "TRY AGAIN! Your score is" + score + "/10", Toast.LENGTH_SHORT).show();
        }
    }

    public void Reset (View view){
        RadioGroupone.clearCheck();
        RadioGrouptwo.clearCheck();
        RadioGroupthree.clearCheck();
        RadioGroupfour.clearCheck();
        RadioGroupfive.clearCheck();
        RadioGroupsix.clearCheck();
        RadioGroupseven.clearCheck();
        RadioGroupeight.clearCheck();
        Name.setText("");
        checkboxStop.setChecked(false);
        checkboxPark.setChecked(false);
        checkboxLoad.setChecked(false);
        checkboxUnload.setChecked(false);
        score=0;
    }



}
