package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isPrime {
    public static void main(String[] args) {

        int N=15;
        Boolean[] prime = new Boolean[5+1];

        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        System.out.println(Solution.isPrime(15));


    }
}

class Solution{
    static int isPrime(int N){
        int count=0;
        if(N==1 || N==0){
            return 0;
        }
        if(N%2==0){
            return 0;
        }
        int n = (int)Math.sqrt(N);
        for(int i=2; i<=n;i++){
            if(N%i==0){
                return 0;
            }
        }

        return 1;
        // code here
    }
}