package topics.string;

public class ValidPalindrome125 {
    public static void main(String[] args) {

        Solution solution= new Solution();
        System.out.println(solution.isPalindrome("M88M"));

    }
}


class Solution {
    public boolean isPalindrome(String str) {


        String s = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        int x = s.length()-1;
        int count=0;
        for(int i=0 ; i<s.length()/2 ; i++){

            if(s.charAt(i) == s.charAt(x--)){
                count++;
            }

        }

        System.out.println(count);


        if(count == s.length()/2){
            return true;
        }
        return false;


    }
}
