package com.amoghbansal.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Details_Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__register);
        final EditText name=(EditText)findViewById(R.id.editText);
        final EditText places=(EditText)findViewById(R.id.editText2);
        final EditText exp=(EditText)findViewById(R.id.editText3);
        final EditText salary=(EditText)findViewById(R.id.editText4);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=name.getText().toString();
                String pass=places.getText().toString();
                String user2=exp.getText().toString();
                String pass2=salary.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });

    }
}
