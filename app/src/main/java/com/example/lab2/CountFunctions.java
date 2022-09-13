package com.example.lab2;

public class CountFunctions {
    static int CountWords(String text){
        String[] words = text.split("[ .,]+");
        return words.length;
    }

    static int CountChars(String text){
        String[] chars = text.split("\\s");
        return text.length();
    }
}
