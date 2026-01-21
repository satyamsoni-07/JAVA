public class SS_04_Operators {
    public static void main(String[] args) {


        //PART 1

        // 1. Arithmetic Operators
        int a = 4;
        int b = 6 + a;
        System.out.println(b);


        // 2. Assignment Operators
        int c = 9;
        c *= 3;
        System.out.println(c);


        // 3. Comparison Operators
        System.out.println(69>3);


        // 4. Logical Operators
        System.out.println(69>3 && 69>15);
        System.out.println(42>11 && 52>82);


        // 5. Bitwise Operators
        System.out.println(2&3);



        // PART 2

        // Precedence & Associativity
        int x = 6*5-34/2;
        /*
        Highest Precedence goes to * and /. They are then evaluated on the basis of left to right Associativity
        example:- 6*5-34/2
                = 30-34/2
                = 30-17
                = 13
         */
        System.out.println(x);
                   //IF//
        int y = 60/5-34*2;
        /*
         Highest Precedence goes to * and /. They are then evaluated on the basis of left to right Associativity
         example:- 60/5-34*2
                 = 12-34*2
                 = 12-68
                 = -56
         */
        System.out.println(y);











    }
}
