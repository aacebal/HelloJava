package com.adelacebal;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Adel", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(2, 3);

        calcFeetAndInchesToCentimeters(40);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet " + inches + " inches are " + centimeters + " centimeters ");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double centimeters = inches * 2.54;

        System.out.println(inches + " inches are " + centimeters + " centimeters ");

        return centimeters;
    }

}
