package com.adelacebal;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//        } while(count <= 6);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 != 0) {
            System.out.println(n + " is not an even number");
            return false;
        }
        System.out.println(n + " is an even number");
        return true;
    }
}
