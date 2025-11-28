import java.util.Scanner;

public class SS_03_TakingInPuts {
    public static void main(String[] args) {

        //if we are writing (int) we can only use (normal numbering like from 0 to infinite)

        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a +b;
        System.out.println("The sum of these number is");
        System.out.println(sum);


        //if we want we can write number that are in (decimal) we have to (put float instant of int)

        //System.out.println("Taking Input From The User");
        //Scanner sc = new Scanner (System.in);
        //System.out.println("Enter number 1");
        //float a = sc.nextFloat();
        //System.out.println("Enter number 2");
        //float b = sc.nextFloat();
        //float sum = a +b;
        //System.out.println("The sum of these number is");
        //System.out.println(sum);


        //if we want to write any word we have to write String str = sc.next();
        //and for line write String str =sc.nextline();

        //(for word)
        //String str = sc.next();
        //System.out.println(str);

        //(for line)
        //String str = sc.nextline();
        //System.out.println(str);



    }
}
