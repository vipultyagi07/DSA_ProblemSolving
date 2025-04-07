package topics.recursion;

import java.util.*;

public class R19_Subsets_78 {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3};

        Solution solution= new Solution();
        List<List<Integer>> result = solution.subsets(inputArray);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }


}



/**
 * print all Subset of an array's element using recursion's Input output method .
 * <p>
 * <b>Example:</b>
 * <pre>
 * I/P: [1,2,3]
 * O/P:
 * []
 * [3]
 * [2]
 * [2, 3]
 * [1]
 * [1, 3]
 * [1, 2]
 * [1, 2, 3]
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1mCdC8Pt8VA1PdOAxwvn_ASWYw1DzCg3R/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return solve(nums, new ArrayList<>(), new ArrayList<>());
    }

    List<List<Integer>> solve(int[] inputList, List<Integer> outputList, List<List<Integer>> result) {

        if (inputList.length == 0) {
            result.add(new ArrayList<>(outputList)); // clone before adding
            return result;
        }

        // Exclude current element
        int[] newInput = Arrays.copyOfRange(inputList, 1, inputList.length);
        solve(newInput, new ArrayList<>(outputList), result);  // exclude

        // Include current element
        outputList.add(inputList[0]);
        solve(newInput, new ArrayList<>(outputList), result);  // include

        return result;
    }
}

