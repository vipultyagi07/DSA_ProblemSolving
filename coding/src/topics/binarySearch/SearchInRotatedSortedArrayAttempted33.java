package topics.binarySearch;

public class SearchInRotatedSortedArrayAttempted33 {
    public static void main(String[] args) {

        Solution3 solution3= new Solution3();
        int arr[]={3,1};
        System.out.println(solution3.search(arr,3));

    }
}

class Solution3 {
    public int search(int[] nums, int target) {


        int minIndex = findTheMinimumIndex(nums);
        System.out.println(minIndex);
        if(minIndex==0){
            return  binarySearch(nums,target,0,nums.length-1);

        }

        else if(nums[minIndex]==target){
            return minIndex;
        }

        else if(target>=nums[minIndex]&& target<=nums[nums.length-1]){

            return  binarySearch(nums,target,minIndex,nums.length-1);

        }
        else if(target<=nums[minIndex-1]&& target>=nums[0]){

            return  binarySearch(nums,target,0,minIndex-1);

        }

        //    int result = binarySearch(nums,target,0,minIndex-1);

        //     if(result!=-1){
        //         return result;
        //     }
        //     else{
        //       return  binarySearch(nums,target,minIndex,nums.length-1);
        //     }
        return -1;
    }

    public int findTheMinimumIndex(int[] arr){

        int start=0, end= arr.length-1,n=arr.length;

        while(start<=end){

            int mid =start+ (end-start)/2;
            int prev = (mid-1+n)%n;
            int next=(mid+1)%n;


            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            else if(arr[end]>=arr[mid]){
                end=mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }

        }
        return 0;
    }

    public int binarySearch(int[] arr,int k, int start, int end){

        while(start<=end){

            int mid= start+(end-start)/2;

            if(arr[mid]==k){
                return mid;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else if(k<arr[mid]){
                end=mid-1;
            }
        }

        return -1;

    }
}

