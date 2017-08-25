package com.adelacebal;

public class Main {

    public static void main(String[] args) {

//        // int has a width of 32
//        int myMinIntValue = -2_147_483_648;
//        int myMaxIntValue = 2_147_483_647;
//        int myNewInt = (myMinIntValue/2);
//
//        System.out.println("My New Int = " + myNewInt);
//
//        // byte has a width of 8
//        byte myMaxByteValue = 127;
//        byte myMinByteValue = -128;
//        byte myNewByte = (byte) (myMinByteValue/2);
//
//        System.out.println("My New Byte = " + myNewByte);
//
//        //short has a width of 64
//        short myMinShortValue = -32768;
//        short myMaxShortValue = 32767;
//        short myNewShort = (short) (myMaxShortValue/2);
//
//        // long has a width of 64
//        long myMinLongValue = -9_223_372_036_854_775_808L;
//        long myMaxLongValue = 9_223_372_036_854_775_807L;

        byte myPracticeByte = 10;
        short myPracticeShort = 20;
        int myPracticeInt = 50;

        long myPracticeLong = 50000L + 10L * (myPracticeByte + myPracticeShort + myPracticeInt);

        System.out.println(myPracticeLong);


    }
}
