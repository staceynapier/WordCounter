package com.example.user.wordcounter;

import android.widget.EditText;

/**
 * Created by user on 08/08/2017.
 */

public class WordCount {

    String words;



    public static int countMe(String words) {
        if (words == null)
            return 0;
        return words.trim().split("\\s+").length;

    }

}
