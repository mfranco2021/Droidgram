package com.example.student.droidgram;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int likes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    /**
     * This method displays the likes on the screen.
     */
    private void displayLikes(int number) {
        TextView likesTextView = (TextView) findViewById(R.id.likes_text_view);
        likesTextView.setText("Likes: " + number);
    }

    public void increase(View view) {
        likes++;
        displayLikes(likes);
    }

    public void decrease(View view) {
       likes--;
       displayLikes(likes);

