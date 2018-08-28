package com.android.alucard.parceble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btSend;
    EditText etUser, etPass, etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSend = findViewById(R.id.btSend);
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        etPhone = findViewById(R.id.etPhone);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = etUser.getText().toString();
                String pass = etPass.getText().toString();
                int phone = Integer.parseInt(etPhone.getText().toString());

                RegisterForm registerForm = new RegisterForm(user, pass, phone);
                //Employee myEmployee = new Employee(1, 56156421, "Dragos", "Stoian");
                //pass data to 2nd Activity with parceable interface
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("myKey", registerForm);
                startActivity(i);


            }
        });
    }
}
