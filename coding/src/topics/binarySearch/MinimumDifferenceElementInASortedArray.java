/**
 * Consider the sorted array arr = [1, 3, 8, 10, 15] and the target value 12.
 *
 * The differences between each element and the target are:
 * |1 - 12| = 11
 * |3 - 12| = 9
 * |8 - 12| = 4
 * |10 - 12| = 2
 * |15 - 12| = 3
 * The element 10 has the smallest absolute difference of 2 from the target 12. Therefore, the output should be 10.
 */


package topics.binarySearch;

public class MinimumDifferenceElementInASortedArray {

    public static void main(String[] args) {

        int a[] = {1,5,9,12};
        int target=5;
        Solution5 solution5 = new Solution5();
        int[] floorAndCeil = Solution5.findTheFloorAndCeil(a, a.length - 1, target);

        int x= Math.max((target - floorAndCeil[0]), (target - floorAndCeil[1]));
        System.out.println(x);


    }

}

class Solution5{


    public static int[] findTheFloorAndCeil(int[] arr, int n, int target) {
        // Write your code here.

        int a[] = new int[2];
        int start=0;
        int end = arr.length-1;

        if(n==1 && arr[0]!=target){
            a[1]=-1;
            a[0]=arr[n-1];
            return a;
        }


        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                a[0]= arr[mid];
                a[1]= arr[mid];

                return a;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }

        if(start>n){
            a[0]=arr[end];
            a[1]=-1;

        }
        else if(end<0){
            a[0] = -1;
            a[1] = arr[start];

        }
        else{
            a[0]=arr[start-1];
            a[1]=arr[start];
        }
        return a;





    }
}

