package com.amoghbansal.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText users=(EditText)findViewById(R.id.username);
        final EditText pw=(EditText)findViewById(R.id.password);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=users.getText().toString();
                String pass=pw.getText().toString();
                Intent i=new Intent(getApplicationContext(),Details_Login.class);
                startActivity(i);

            }
        });
        Button c=(Button)findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),register.class);
                startActivity(i);
            }
        });





    }
}
