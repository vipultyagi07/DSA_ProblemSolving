package topics.recursion;

import java.util.ArrayList;

public class R20_PermutationWithSpaces {
    public static void main(String[] args) {

        String s= "abc";
        Solution1 solution = new Solution1();
        ArrayList<String> permutation = solution.permutation(s);
        permutation.sort(null);
        System.out.println(permutation);
    }
}

class Solution1 {

    /**
     * print all permutation with spaces of a String using recursion's Input output method .
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: "abc"
     * O/P: [a_b_c, a_bc, ab_c, abc]
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1VgdNDQcXaNTYUeuAh-VmqoN1MH3dX23-/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */


    ArrayList<String> permutation(String s) {
        // Code Here
        ArrayList<String> result=new ArrayList<>();

        return solve(s.substring(1), s.substring(0,1),result);
    }


    ArrayList<String> solve(String input,String output,ArrayList<String> result){


        if(input.isEmpty()){
            result.add(output);
            return result;
        }

        String out1 = output+input.substring(0,1);
        String out2 = output+"_"+input.substring(0,1);

        String newInp = input.substring(1);

        solve(newInp,out1,result);
        solve(newInp,out2,result);

        return result;


    }

}
