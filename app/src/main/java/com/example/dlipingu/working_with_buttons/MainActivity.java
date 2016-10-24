package com.example.dlipingu.working_with_buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;
    Button add, sub;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        display = (TextView) findViewById(R.id.displaying);
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                counter++;
                display.setText("Your total is " + counter);

            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                counter--;
                display.setText("Your total is " + counter);

            }
        });
    }
}
