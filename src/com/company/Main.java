package com.company;

import java.util.Scanner;

public class Main {
    static String[][] lecture = new String[3][3];


    public static void main(String[] args) {
        lecture[0][0] = "Java Core";
        lecture[1][0] = "Core Java API";
        lecture[2][0] = "Class design";

        System.out.println("Welcome to the learning management system");
        navigations();

    }

    private static void navigations() {
        System.out.println("please make your choice from the offered options\n");
        System.out.println("1. display all available lectures (number and title)");
        System.out.println("2. add a new lecture");
        System.out.println("3. delete a lecture by its number");
        int choice = getConsoleOutput();
        switch (choice){
            case 1:
                getLecture();
                break;
            default:
                System.out.println("такого пункта в меню нет");
                break;
        }
    }

    private static void getLecture() {
        for (int i = 0; i < lecture.length; i++) {
            int numbOfLecture = i + 1;
            String nameOfLecture = lecture[i][0];
            System.out.println(numbOfLecture + "." + nameOfLecture);
        }
    }


    private static int getConsoleOutput() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
