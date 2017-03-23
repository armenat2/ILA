package com.ilasoftware.ssanina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zaebashitb(){
        TextView tv = (TextView) findViewById(R.id.cock);
        tv.setText("You are 3,14DOOR");
    }
}
