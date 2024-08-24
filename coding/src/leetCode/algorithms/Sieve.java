package leetCode.algorithms;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {

        int n = 12;
        Answer answer = new Answer();

        int[] ans = answer.findTotalPrime(n);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }



    }
}

class Answer {
//1 to n

    public int[] findTotalPrime(int n) {

        // but I am finding from 0 to n
        Boolean[] isPrime= new Boolean[n+1];

        Arrays.fill(isPrime,true);

        isPrime[0]=isPrime[1]=false;


        for(int i=2;i*i<=n;i++){

            // consider 4 in your mind
            if(isPrime[i]){

                for(int j=i*i;j<=n;j=j+i){

                    isPrime[j]=false;

                }

            }
        }

        // preparing answer
        int[] ans= new int[n+1];
        int x=0;
        for(int i=0;i<=n;i++){
            if(isPrime[i]){
                 ans[x]=i;
                 x++;
            }
        }
        return ans;
    }
}