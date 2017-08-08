package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/08/2017.
 */

public class WordCountTest {

    String words;

    @Before
    public void before() {
        words = new String("why am I here?");
    }

    @Test
    public void testCounter() {
        assertEquals(4, WordCount.countMe(words));
    }
}
