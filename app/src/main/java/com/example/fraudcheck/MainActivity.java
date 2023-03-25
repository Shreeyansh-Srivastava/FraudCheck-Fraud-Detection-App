package com.example.fraudcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button Checkbutton = null;
EditText Link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();a
        Checkbutton = (Button) findViewById(R.id.checkbutton);
        Link = (EditText) findViewById(R.id.link);

        Checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Linestring = Link.getEditableText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://transparencyreport.google.com/safe-browsing/search?url="+Linestring+"&hl=en"));
                startActivity(i);
            }
        });

    }
}