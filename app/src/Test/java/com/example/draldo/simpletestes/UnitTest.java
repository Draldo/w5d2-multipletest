package com.example.draldo.simpletestes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Draldo on 18/08/2016.
 */
public class UnitTest {
    @Test
    public void reverse() throws Exception {
        String string = "Omar";
        assertEquals("ramO", ReverseHelper.reverseStr("Omar"));
    }
}
