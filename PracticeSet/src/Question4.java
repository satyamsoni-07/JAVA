/*
Write a Java program which asks the user to enter his/her name and greet them with
("Hello<name>, have a Good day")
 */

import java.util.Scanner;

public class Question4 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your Name");
        String name = sc.next();

        System.out.println("Hello " +name +" I Love You");

    }


}
