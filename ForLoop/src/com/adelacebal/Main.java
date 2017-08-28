package com.adelacebal;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));
//        for (int i = 2; i <= 10 ; i++) {
//            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.0f", calculateInterest(10000.0, i)));
//        }
//        for (int i = 8; i >= 2 ; i--) {
//            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.0f", calculateInterest(10000.0, i)));
//        }

        int primeCounter = 0;
        for (int i = 0; i <= 1000; i++) {
            boolean primeNumber = isPrime(i);
            if (primeNumber == true) {
                System.out.println( i + " is a Prime Number");
                primeCounter ++;
                if (primeCounter > 20) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i ++) {
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
