package leetCode;

import java.util.Arrays;

public class UglyNumber {
    public static void main(String[] args) {

        System.out.println(new Solution().isUgly(214797179));
    }
}
class Solution {
    public boolean isUgly(int n) {

        boolean isUgly = findAllPrimeFactor(n);

        return isUgly;
    }

    public boolean findAllPrimeFactor(int n){
        if(n<1){
            return false;
        }
        boolean[] prime= new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;

        for(int i=2;i<=n;i++){

            if(prime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(prime[i]){
                if(i>5){
                    return false;
                }
            }
        }


        return true;
    }
}
