package leetCode.dutchFlag;

public class SortColors {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0, 1, 0, 1, 0};
        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }
}

class Solution {
    public void sortColors(int[] nums) {

        int start = 0, mid = 0, end = nums.length - 1;

        while (mid <= end) {

            if (nums[mid] == 2) {
                swapNumber(nums, mid, end);
                end--;
            } else if (nums[mid] == 0) {
                swapNumber(nums, mid, start);
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }


        }


    }

    public void swapNumber(int[] nums, int x, int y) {

        int temp = 0;

        temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

    }
}
