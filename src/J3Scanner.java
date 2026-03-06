import java.util.Scanner;

public class  J3Scanner {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age : ");
        int age = scanner.nextInt();

        System.out.print("What is you cgpa : ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a Student (true/false) ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(isStudent);

        /*if(isStudent){
            System.out.println("You are enrolled as a Student");
        }
        else{
            System.out.println("You are NOT a Student");
        }

         */


        //System.out.println("Hello "+name);
        //System.out.println("You are "+age+ " Year's old");
        //System.out.println("Your CGPA is "+cgpa);
        //System.out.println("Student : " + isStudent);



        scanner.close();



    }
}


