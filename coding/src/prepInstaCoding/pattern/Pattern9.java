package prepInstaCoding.pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        System.out.println("Enter the size of pattern");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int changingPoint=n/2+1;

   int i1=1;
        for(int i=1;i<=n;i++){
            int k = i <changingPoint ? i1++ : i1--;

            for(int j=1;j<=n;j++){

                if(j>=n/2+2-k && j<=n/2+k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }




            }
            System.out.println();
        }


    }
}
