package com.example.kotoleksiihomeworkandroidrgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout chkLayout;
    private TextView txtTitle;
    private CheckBox cbxRed;
    private CheckBox cbxGreen;
    private CheckBox cbxBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbxRed = findViewById(R.id.cbxRed);
        cbxRed.setOnClickListener(this);
        cbxGreen = findViewById(R.id.cbxGreen);
        cbxGreen.setOnClickListener(this);
        cbxBlue = findViewById(R.id.cbxBlue);
        cbxBlue.setOnClickListener(this);

        chkLayout = findViewById(R.id.chkLayout);
        txtTitle = findViewById(R.id.txtTitle);
    }


    @Override
    public void onClick(View view) {
        int red = cbxRed.isChecked() ? 255 : 0;
        int green = cbxGreen.isChecked() ? 255 : 0;
        int blue = cbxBlue.isChecked() ? 255 : 0;

        int textColor = Color.rgb(
                Math.abs(255 - red),
                Math.abs(255 - green),
                Math.abs(255 - blue)
        );
        cbxRed.setTextColor(textColor);
        cbxGreen.setTextColor(textColor);
        cbxBlue.setTextColor(textColor);

        txtTitle.setTextColor(textColor);
        chkLayout.setBackgroundColor(Color.rgb(red, green, blue));
    }
}