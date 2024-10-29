package com.demo.demolibrary.lib.prac;

/**
 * Author: Badsna Shrestha
 * Date: 10/29/2024
 */
public final class StringPadderFactory {
    private StringPadderFactory(){

    }

    public static StringPadder createStringPadder(){
        return new StringPadderImpl();
    }
}

