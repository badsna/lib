package com.demo.demolibrary.lib.prac;

/**
 * Author: Badsna Shrestha
 * Date: 10/29/2024
 */
public class StringPadderImpl implements StringPadder {
    @Override
    public String padLeft(String stringToPad, int totalLength) {
        return padLeft(stringToPad, totalLength, ' ');
    }

    @Override
    public String padLeft(String stringToPad, int totalLength, char paddingCharacter) {
        return getStringToBeAdded(stringToPad, totalLength, paddingCharacter) + stringToPad;
    }

    private String getStringToBeAdded(String stringToPad, int totalLength, char paddingCharacter) {
        int quantity=totalLength -stringToPad.length();
        if(quantity>0){
            return Character.toString(paddingCharacter).repeat(quantity);
        }
        else {
            return "";
        }
    }

    @Override
    public String padRight(String stringToPad, int totalLength) {
        return padRight(stringToPad, totalLength, ' ');
    }

    @Override
    public String padRight(String stringToPad, int totalLength, char paddingCharacter) {
        return stringToPad + getStringToBeAdded(stringToPad, totalLength, paddingCharacter);
    }

    public int add(int a, int b){
        return a+b;
    }

}
