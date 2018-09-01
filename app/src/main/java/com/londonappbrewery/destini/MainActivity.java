package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int myStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final TextView story_text = (TextView) findViewById(R.id.storyTextView);
        final Button button1 = (Button) findViewById(R.id.buttonTop);
        final Button button2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myStoryIndex == 1 || myStoryIndex == 2){
                    story_text.setText(R.string.T3_Story);
                    button1.setText(R.string.T3_Ans1);
                    button2.setText(R.string.T3_Ans2);
                    myStoryIndex = 3;
                }
                else{
                    story_text.setText(R.string.T6_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    myStoryIndex = 6;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myStoryIndex == 1){
                    story_text.setText(R.string.T2_Story);
                    button1.setText(R.string.T2_Ans1);
                    button2.setText(R.string.T2_Ans2);
                    myStoryIndex = 2;
                }
                else if(myStoryIndex == 2){
                    story_text.setText(R.string.T4_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    myStoryIndex = 4;
                }
                else{
                    story_text.setText(R.string.T5_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    myStoryIndex = 5;
                }
            }
        });

    }
}
