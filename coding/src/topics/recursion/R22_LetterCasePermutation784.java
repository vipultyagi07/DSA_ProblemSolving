package topics.recursion;

import java.util.*;

public class R22_LetterCasePermutation784 {

    public static void main(String[] args) {
        Solutions solution = new Solutions();

        System.out.println(solution.letterCasePermutation("a11bc2"));
    }
}

/**
 * print all permutation with Letter case change of a String using recursion's Input output method .
 * <p>
 * <b>Example:</b>
 * <pre>
 * <a href="https://leetcode.com/problems/letter-case-permutation/description/" target="_blank">LeetCode 784</a>.
 * I/P: "a1b"
 * O/P: [a1b, a1B, A1b, A1B]
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1WK31sS9I_fgohQjGED4Xsfjk4DHt3Ge5/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */


class Solutions {
    public List<String> letterCasePermutation(String input) {

        List<String> result = new ArrayList<>();

        return solve(input,"",result);

    }

    List<String> solve(String input, String output,List<String> result){
        if(input.isEmpty()){
            result.add(output);
            return result;
        }
        int index = getCharIndex(input);

        if(index==-1){
            result.add(output+input);
            return result;
        }

        String out1= output + input.substring(0,index+1);
        String out2 = output + input.substring(0,index)+changeLetter(input.substring(index,index+1));
        String newInput = input.substring(index+1);

        solve(newInput,out1,result);
        solve(newInput,out2,result);

        return result;


    }

    int getCharIndex(String input){

        for(int i=0;i<input.length();i++){

            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                return i;
            }
            else if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
                return i;
            }
        }

        return -1;
    }

    char changeLetter(String str){
        char ch = str.charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            return (char)(ch - ('a' - 'A'));  // to uppercase
        } else if (ch >= 'A' && ch <= 'Z'){
            return (char)(ch + ('a' - 'A'));  // to lowercase
        } else {
            return ch; // Non-alphabet character
        }
    }



}