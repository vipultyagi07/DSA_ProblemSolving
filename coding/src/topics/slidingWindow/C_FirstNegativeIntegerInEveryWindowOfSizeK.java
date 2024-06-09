package topics.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class C_FirstNegativeIntegerInEveryWindowOfSizeK {

    public static void main(String[] args) {

        long a[] =  {12, -1, -7, 8, -15, 30, 16, 28};
        int K=3;
        int N=8;
        Compute  compute= new Compute();
         long ans[] = compute.printFirstNegativeInteger(a,N,K);
        for(int i=0;i<(N-K+1);i++){
            System.out.print(ans[i]+" ");
        }



    }

}


class Compute {

    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        UtilityMethod utilityMethod= new UtilityMethod();
        long a[]= new long[N-K+1];


        int start_index=0;
        int end_index=0;
        int array_index=0;

        while(end_index<N){


            if(end_index-start_index+1<K){
                end_index++;

            }
            else if(end_index-start_index+1==K){
                a[array_index]=utilityMethod.findFirstNegative(A, start_index, end_index);
                array_index++;
                start_index++;
                end_index++;
            }

        }
        return a;

    }

}

class UtilityMethod{

    public long findFirstNegative(long A[], int start_index, int end_index){
        long negNumber=0;
        for(int i=start_index;i<=end_index;i++){
            if(A[i]<0){
                negNumber=A[i];
                break;

            }
        }

        return negNumber;

    }

}