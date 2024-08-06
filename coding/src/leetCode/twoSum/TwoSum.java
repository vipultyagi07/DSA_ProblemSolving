package leetCode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int nums[]={7,11,15,2};
        int target=9;
        Solution solution= new Solution();
        System.out.println();


    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new  int[2];
        Map<Integer, Integer> unorderd_map= new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int sub = target-nums[i];

            if(unorderd_map.containsKey(sub)){
                ans[0]=unorderd_map.get(sub);
                ans[1]=i;
            }
            unorderd_map.put(nums[i],i);
        }
        return ans;
    }
}
