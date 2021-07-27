package com.example.experiment10;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int color=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textEle = findViewById(R.id.textInp);

        final SeekBar FontSize = findViewById(R.id.FontSize);
        FontSize.setMax(60);
        final Button FontColor = findViewById(R.id.FontColor);

        FontColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (color) {
                    case 1:
                        textEle.setTextColor(Color.RED); break;
                    case 2:
                        textEle.setTextColor(Color.GREEN); break;
                    case 3:
                        textEle.setTextColor(Color.BLUE); break;
                    case 4:
                        textEle.setTextColor(Color.CYAN); break;
                    case 5:
                        textEle.setTextColor(Color.YELLOW); break;
                    case 6:
                        textEle.setTextColor(Color.MAGENTA); break;
                }
                color++;
                if(color>=7){
                    color=1;
                }

            }
        });



//       seekbar tracking
        FontSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                textEle.setText(String.valueOf(progressChangedValue));
                textEle.setTextSize(progressChangedValue);
            }
        });

    }

    }



