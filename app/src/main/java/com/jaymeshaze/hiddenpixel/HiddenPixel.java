package com.jaymeshaze.hiddenpixel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HiddenPixel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_pixel);
    }


    public void updateTextOne (View view){
        Button button = (Button) findViewById(R.id.buttonOne);
        button.setText("check");
    }

    public void updateTextTwo (View view){
        Button button = (Button) findViewById(R.id.buttonTwo);
        button.setText("check");
    }

    public void updateTextThree (View view){
        Button button = (Button) findViewById(R.id.buttonThree);
        button.setText("check");
    }

    public void updateTextFour (View view){
        Button button = (Button) findViewById(R.id.buttonFour);
        button.setText("check");
    }

    public void updateTextFive (View view){
        Button button = (Button) findViewById(R.id.buttonFive);
        button.setText("check");
    }

    public void updateTextSix (View view){
        Button button = (Button) findViewById(R.id.buttonSix);
        button.setText("check");
    }
}
