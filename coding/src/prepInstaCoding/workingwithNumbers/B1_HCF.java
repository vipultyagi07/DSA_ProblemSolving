package prepInstaCoding.workingwithNumbers;

import java.util.Scanner;

public class B1_HCF {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter first number");
        int a=s.nextInt();

        System.out.println("Enter Second number");
        int b=s.nextInt();

        int x=a>b?a:b;

        for(int i=x;i>=1;i--){

            if(a%i==0&&b%i==0){
                System.out.println("HCF of "+a+" and "+b+" is "+i);
                break;
            }

        }


    }
}
