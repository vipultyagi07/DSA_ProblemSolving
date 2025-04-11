package topics.recursion;

import java.util.ArrayList;

public class R21_PermutationWithCaseChange {


    public static void main(String[] args) {

        String input = "ab";

        ArrayList<String> result= new ArrayList<>();
        System.out.println(solve(input,"",result));

    }

    /**
     * print all permutation with case change of a String using recursion's Input output method .
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: "ab"
     * O/P: [ab, aB, Ab, AB]
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/18zCQDb_S3VUIYha5ddVwRS-7Z2-KTrVH/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */

    private static ArrayList<String> solve(String input, String output, ArrayList<String> result) {

        if(input.isEmpty()){
            result.add(output);
            return result;
        }

        String output1 = output+input.substring(0,1);
        String output2 = output+input.substring(0,1).toUpperCase();

        String newInput = input.substring(1);

        solve(newInput,output1,result);
        solve(newInput,output2,result);
        return result;

    }

}
