/*
Write a Java program to Convert Kilometer to miles
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Kilometer");
        int Kilometer = sc.nextInt();

        float miles = Kilometer * 0.621371f;;
        System.out.println(Kilometer +"kilometer = " +miles +"miles");



    }


}
