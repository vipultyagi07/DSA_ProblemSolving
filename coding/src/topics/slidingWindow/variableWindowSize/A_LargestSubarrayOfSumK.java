package topics.slidingWindow.variableWindowSize;

import java.util.HashMap;
import java.util.Map;

public class A_LargestSubarrayOfSumK {

    public static void main(String[] args) {

        int nums[] = {3,0,0,3,2,1};
        int k=3;

        Solution solution= new Solution();

        System.out.println(solution.subarraySum(nums,k));

    }

}

    class Solution {
    public int subarraySum(int[] nums, int k) {
        // Initialize the count of subarrays and the prefix sum
        int count = 0;
        int currentPrefixSum = 0;

        // Create a hashmap to store the frequency of prefix sums
        Map<Integer, Integer> prefixSums = new HashMap<>();
        // Add an initial entry to handle subarrays that start from the beginning
        prefixSums.put(0, 1);

        // Iterate through the array
        for (int num : nums) {
            // Update the current prefix sum
            currentPrefixSum += num;

            // Check if there exists a prefix sum that, when subtracted from currentPrefixSum, equals k
            if (prefixSums.containsKey(currentPrefixSum - k)) {
                count += prefixSums.get(currentPrefixSum - k);
            }

            // Update the frequency of the current prefix sum in the hashmap
            prefixSums.put(currentPrefixSum, prefixSums.getOrDefault(currentPrefixSum, 0) + 1);
        }

        return count;
    }
}


