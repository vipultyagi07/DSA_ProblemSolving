package leetCode.removeDuplicate80;

import com.sun.security.jgss.GSSUtil;

public class RemoveDuplicate80 {
    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,1,2,2,2,3};
        Solution solution= new Solution();
        int i = solution.removeDuplicates(arr);
        System.out.println(i);

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        int count=0;
        int i=0;
        for(int j=0;j<nums.length;j++){

            if(i<2 || nums[j]!=nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
}