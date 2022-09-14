package com.example.lab2;

public class CountFunctions {
    static int countWords(String text){
        String[] words = text.split("[ .,]+");
        return words.length;
    }

    static int countChars(String text){
        String[] chars = text.split("\\s");
        return text.length();
    }
}
