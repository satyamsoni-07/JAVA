public class J0Questions {


    //Variables//

    /*QUESTION :-
          get an output of (string=BroCode, int gta=6, double pi=3.14159, char gender=M, boolean isAdmin=true)
          */

    public static void main(String[] args) {

        String name = "Bro Code";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println("My name is "+name);
        System.out.println("Its a gta "+gta);
        System.out.println("The value of pi is "+pi);
        System.out.println("My gender is "+gender);

        if(isAdmin){
            System.out.println("You are Admin now");
        }
        else{
            System.out.println("You are NOT an Admin");
        }

    }



}
