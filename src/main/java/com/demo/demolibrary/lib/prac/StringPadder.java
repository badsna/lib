package com.demo.demolibrary.lib.prac;

/**
 * Author: Badsna Shrestha
 * Date: 10/28/2024
 */
public interface StringPadder {
    String padLeft(String stringToPad,int totalLength);

    String padLeft(String stringToPad, int totalLength,char paddingCharacter);

    String padRight(String stringToPad, int totalLength);
    String padRight(String stringToPad, int totalLength, char paddingCharacter);


}
