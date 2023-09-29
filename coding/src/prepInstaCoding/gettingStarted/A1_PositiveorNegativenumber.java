package prepInstaCoding.gettingStarted;

import java.util.Scanner;

public class A1_PositiveorNegativenumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int i = s.nextInt();
        if(i<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }
    }
}
