package topics.slidingWindow;

public class B_Print_Maximum_sum_subArray_of_size_k {


    public static void main(String[] args) {

        int a[] = {2,5,1,8,2,9,1};
        int k=3;

        System.out.println("maximum sum= "+printMaxSumOfASubArrayInAnArray(a,k));

    }

    private static int printMaxSumOfASubArrayInAnArray(int[] a, int k) {


        int i=0;
        int j=0;
        int start_index=0;
        int end_index=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int n=a.length;

        while(j<a.length){

            sum=sum+a[j];
            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1)==k){
                if(sum>maxSum){
                    start_index=i;
                    end_index=j;
                    maxSum=sum;
                }
                sum=sum-a[i];
                i++;
                j++;
            }

        }
        System.out.print("maximum sum sub array: {");
        for(int x=0;x<a.length;x++){
            if(x>=start_index&&x<=end_index){
                System.out.print(a[x]);
                if(x==end_index){
                    continue;
                }
                System.out.print(",");

            }
        }
        System.out.print("}");
        System.out.println();

        return maxSum;
    }
}
