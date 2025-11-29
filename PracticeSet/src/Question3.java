/*
Write a program to calculate CGPA using marks of three subjects (out of 100 marks each)
 */

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args){

        System.out.println("Taking Input From the user");
        Scanner sc =  new Scanner(System.in);

        System.out.println("Subject 1");
        int a = sc.nextInt();

        System.out.println("Subject 2");
        int b = sc.nextInt();

        System.out.println("Subject 3");
        int c = sc.nextInt();

        int sum = (a +b +c);

        float CGPA = sum/30.0f;
        System.out.println("CGPA of your semester is:");
        System.out.println(CGPA);






    }
}