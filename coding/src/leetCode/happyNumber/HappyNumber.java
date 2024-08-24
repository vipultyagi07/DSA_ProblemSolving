package leetCode.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(new Solution().isHappy(19));

    }
}
class Solution {
    public boolean isHappy(int n) {

        Set<Integer> powSumSet= new HashSet<>();

        while(true){
            int sum=0;
            String s= "wefwf";
            String t =" dverwv";

            char[] S = s.toCharArray();
            char[] T = t.toCharArray();


            while(n!=0){

                sum = sum + (int)Math.pow(n%10,2.0);
                n=n/10;

            }

            if(sum==1){
                return true;
            }
            if(powSumSet.contains(sum)){
                return false;
            }
            powSumSet.add(sum);

            n = sum;

        }

    }
}
