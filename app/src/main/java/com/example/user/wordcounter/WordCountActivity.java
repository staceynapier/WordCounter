package com.example.user.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText counterEditText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        counterEditText = (EditText)findViewById(R.id.counter_text);
        button = (Button)findViewById(R.id.button);
    }

    public void onPressButton(View button){
        Log.d(getClass().toString(), "Button was pressed");
        String counter = counterEditText.getText().toString();
        Log.d(getClass().toString(), "The words entered were '" + counter + "'");
        WordCount wordCount = new WordCount();
        int result = WordCount.countMe(counter);

        Intent intent = new Intent(this, AnswerActivity.class); //where you are, where you are going
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
