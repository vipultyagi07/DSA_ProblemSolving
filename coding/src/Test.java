import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        /**
         * @problem
         * statement
         */
        // add two number

        int a=9;
        int b=99;

        int c=a+b;
        System.out.println(c);

        // what if we want to take input from command line/ terminal

        /**
         *
         * @solution
         *
         * if you want to use anything, I have a class for it
         */

        Scanner s= new Scanner(System.in);

        System.out.println("Enter first number");
        int x = s.nextInt();
        System.out.println("Enter second number");
        int y = s.nextInt();

        int z=x+y;

        System.out.println("second sum "+z);


        /**
         * Data types
         */

        // int --> whole number(1,2, -99)                   ||   long
        // float --> decimal number(1.223,-22.12331)        ||   double
        // String --> string("Alphanume12ric"),
        // char --> character('a','l', etc.)
        // boolean --> true / false


        /**
         * String
         *
         *  in C++/C String is a array of character
         *
         *  in java it is datatype
         *
         */








        // how to give output
        System.out.println("hi himanshu");
    }
}
