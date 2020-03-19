package com.codinginflow.loginquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private Button submit;
    private Button backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //makes sure the edit can not be empty
        final EditText email = findViewById(R.id.email);
        final EditText lastname = findViewById(R.id.lname);
        final EditText birthday = findViewById(R.id.bday);

        submit = findViewById(R.id.sub);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_main();
                // the if then statements
                if (email.getText().length()==0) {
                    email.setError("Please Enter email");

                }else if (lastname.getText().length()==0) {
                    lastname.setError("Please Enter last name");

                }else if (birthday.getText().length()==0) {
                    birthday.setError("Please Enter birthday");

                    backhome = findViewById(R.id.back);
                    backhome.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openactivity_main();
                        }
                    });

                }
            }
        });
    }

    private void openactivity_main() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
