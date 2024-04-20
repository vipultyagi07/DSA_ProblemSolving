package leetCode.TwoZeroFour.optimized;

import java.util.Arrays;

public class CountPrimes_Optimized {

    public static void main(String[] args) {
        int x=40;
        System.out.println(countPrimes(x));
    }
    public static int countPrimes(int n) {
            if(n==0){
                return 0;
            }
            if(n==1){
                return 0;
            }
            boolean[] prime =new boolean[n+1];
            Arrays.fill(prime,true);
            prime[1]=false;
            int count=0;

            for(int i=2;i<n;i++){

                if(prime[i]){
                    count++;

                    for(int j=2*i;j<n;j=j+i){
                        prime[j]=false;
                    }
                }
            }
            return count;
        }

    }

