/*
Write a Program to Calculate percentage of a given student in CBSE board exam.
His marks from 5 subject must be taken as input from the user
 */

import java.util.Scanner;

public class Question1 {

    public static void main(String[]args){

        System.out.println("Calculate your percentages");
        Scanner sc = new Scanner(System.in);

        System.out.println("Subject 1");
        int a = sc.nextInt();
        System.out.println("Subject 2");
        int b = sc.nextInt();
        System.out.println("Subject 3");
        int c = sc.nextInt();
        System.out.println("Subject 4");
        int d = sc.nextInt();
        System.out.println("Subject 5");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        float percentage = (sum / 500.0f) * 100;

        System.out.println("Total Marks = " + sum);
        System.out.println("Percentage = " + percentage + "%");


    }
}