package com.example.task06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Button click;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=(Button)findViewById(R.id.click);
        tb=(ToggleButton)findViewById(R.id.tb);
        sw=(Switch)findViewById(R.id.sw);
    }
    public void setMyScreenColor(int color){
        View view= this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void ColorSwitcher(View view) {
        if (tb.isChecked()&&sw.isChecked()==false){
            setMyScreenColor(Color.GREEN);
        }
        else if(sw.isChecked()&&tb.isChecked()==false){
            setMyScreenColor(Color.RED);
        }
        else if(tb.isChecked()&&sw.isChecked()){
            setMyScreenColor(Color.BLUE);
        }
        else{
            setMyScreenColor(Color.GRAY);
        }
    }
}
