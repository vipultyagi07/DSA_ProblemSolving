package leetCode.threeSum;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(arr);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> smallAnsList = new HashSet<>();


        for (int i = 0; i < nums.length - 1; i++) {

            int target = nums[i];
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[l] + nums[r] + target;

                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else if (sum == 0) {
                    smallAnsList.add(Arrays.asList(target, nums[l], nums[r]));
                    l++;
                    r--;
                }

            }
        }
        return new ArrayList<>(smallAnsList);
    }

}

