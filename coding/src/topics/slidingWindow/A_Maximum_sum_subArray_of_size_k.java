package topics.slidingWindow;

public class A_Maximum_sum_subArray_of_size_k {

    public static void main(String[] args) {

        int a[] = {2,5,1,8};
        int k=3;

        System.out.println(maxSumOfASubArrayInAnArray(a,k));

    }

    private static int maxSumOfASubArrayInAnArray(int[] a, int k) {


        int i=0;
        int j=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int n=a.length;

        while(j<a.length){


            sum=sum+a[j];
            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1)==k){
                maxSum=Math.max(sum,maxSum);
                sum=sum-a[i];
                i++;
                j++;
            }

        }

        return maxSum;
    }
}
