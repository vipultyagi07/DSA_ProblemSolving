package topics.binarySearch;

public class BinarySearch704 {

    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,7,9};
        int target = 9;

       Solution solution= new Solution();
        int index = solution.binarySearch(nums, target);

        System.out.println("Element present on "+index+" index");

    }
}

class Solution {
    public int binarySearch(int[] nums, int k) {

        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if(k==nums[mid]){
                return mid;
            }
            else if(k>nums[mid]){
                start=mid+1;
            }

            else if(k<nums[mid]){
                end=mid-1;
            }


        }
        return -1;
    }
}
