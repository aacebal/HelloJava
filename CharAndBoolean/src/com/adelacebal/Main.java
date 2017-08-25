package com.adelacebal;

public class Main {

    public static void main(String[] args) {
	    char myChar = '\u00AE';
        char mySecondChar = '®';

        System.out.println("myChar = " + myChar);
        System.out.println("mySecondChar = " + mySecondChar);

        boolean myBoolean = myChar == mySecondChar;

        System.out.println("myBoolean = " + myBoolean);
    }
}
