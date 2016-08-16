package com.example.draldo.simpletestes;

/**
 * Created by Draldo on 16/08/2016.
 */
public class ReverseHelper {

    public static String reverseStr(String text){
        StringBuilder stringBuilder = new StringBuilder(text).reverse();
        return stringBuilder.toString();
    }
}
