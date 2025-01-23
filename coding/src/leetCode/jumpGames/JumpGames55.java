package leetCode.jumpGames;

public class JumpGames55 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int a[]= {2,5,0,0};
        System.out.println(solution.canJump(a));


    }
}

class Solution {
    public boolean canJump(int[] nums) {

        int max= Integer.MIN_VALUE;

        if(nums.length==1 && nums[0]==0){
            return true;
        }

        for(int i=0;i<nums.length;i++){

            int temp = i+nums[i];

            if(max<temp){
                max=temp;
            }

            if(max>=(nums.length-1)){
                return true;
            }
            if(nums[i]==0 && max==i){
                return false;
            }


        }


        return false;
    }
}