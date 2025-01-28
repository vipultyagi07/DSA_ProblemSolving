package topics.binarySearch;

public class ReverseSortedBinarySearch {

    public static void main(String[] args) {
        int nums[] ={9,7,6,4,3,2,1};
        int target = 1;

        Solution1 solution= new Solution1();
        int index = solution.binarySearch(nums, target);

        System.out.println("Element present on "+index+" index");

    }
}

class Solution1 {
    public int binarySearch(int[] nums, int k) {

        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if(k==nums[mid]){
                return mid;
            }
            else if(k<nums[mid]){
                start=mid+1;
            }

            else if(k>nums[mid]){
                end=mid-1;
            }


        }
        return -1;
    }
}