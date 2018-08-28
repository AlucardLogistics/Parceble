package com.android.alucard.parceble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSend = findViewById(R.id.btSend);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee myEmployee = new Employee(1, 56156421, "Dragos", "Stoian");
                //pass data to 2nd Activity with parceable interface
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("myKey", myEmployee);
                startActivity(i);
            }
        });
    }
}
