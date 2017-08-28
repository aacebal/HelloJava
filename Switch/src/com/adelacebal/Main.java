package com.adelacebal;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, 4 or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }

        char switchChar = 'B';

        switch(switchChar) {
            case 'A': case 'B':case 'C': case 'D': case 'E':
                System.out.println("We found " + switchChar + "!");
                break;
            default:
                System.out.println("Couldn't find them!");
        }

        String month = "MARCH";
        switch(month.toLowerCase()) {
            case "january": case "february": case "march": case "april":
            case "june": case "july": case "august": case "september":
            case "october": case "november": case "december":
                System.out.println(month + " is a month");
            break;
            default:
                System.out.println(month + " is not a month");
        }

    }
}
