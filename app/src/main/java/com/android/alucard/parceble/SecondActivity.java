package com.android.alucard.parceble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView mId, mPhoneNo, mFirstName, mLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       // Employee myEmployee = getIntent().getExtras().getParcelable("myKey");
        RegisterForm form = getIntent().getExtras().getParcelable("myKey");

//        int id = myEmployee.getId();
//        int phoneNo = myEmployee.getPhoneNo();
//        String firstName = myEmployee.getFistName();
//        String lastName = myEmployee.getLastName();

        String username = form.user;
        String pass = form.pass;
        int phone = form.phoneNo;

        Toast.makeText(this, " phone: " + phone + " user: " + username + " pass: " + pass, Toast.LENGTH_LONG).show();


    }
}
