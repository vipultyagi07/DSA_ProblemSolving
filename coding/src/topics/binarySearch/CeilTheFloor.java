package topics.binarySearch;

public class CeilTheFloor {

    public static void main(String[] args) {

        Solution4 solution3= new Solution4();
//        int arr[]={6,6,7,12,16,18,19,22,23,30};
        int arr[]={6};
        System.out.println(Solution4.getFloorAndCeil(arr,1,6));

    }
}

class Solution4 {
    public static int[] getFloorAndCeil(int[] arr,int n, int target) {
        // Write your code here.

        int a[] = new int[2];
        int start=0;
        int end = arr.length-1;
        if(arr.length==1 && arr[0]!=target){
            a[1]=-1;
            a[0]=arr[arr.length-1];
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

        if(start==0){
            a[0]=-1;
            a[1]=arr[start];
        }
        else if(start>=n){
            a[0]=arr[start-1];
            a[1]=-1;
        }
        else{
            a[0]=arr[start-1];
            a[1]=arr[start];
        }
        return a;



    }

}
