package com.codinginflow.loginquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //buttons
    private Button reg;
    private Button quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connections of buttons
        reg = findViewById(R.id.re);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregistration();

                quiz = findViewById(R.id.lo);
                quiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openquiz();
                    }
                });


            }
        });
    }

    //connects the buttons to the other activities
    public void openregistration() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openquiz() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}