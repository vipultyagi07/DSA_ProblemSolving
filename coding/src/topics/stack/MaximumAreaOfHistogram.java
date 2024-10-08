package topics.stack;

import java.util.Stack;

public class MaximumAreaOfHistogram {
    public static void main(String[] args) {
//        int[] arr= {6,2,5,4,5,1,6};
        int[] arr= {2,4};
        int maxArea = SolutionX.getMaxArea(arr);
        System.out.println(maxArea);


    }
}



class SolutionX {
    // Function to find largest rectangular area possible in a given histogram.
    public static int getMaxArea(int hist[]) {
        // your code here
        int n= hist.length;

        Stack<Integer> stack= new Stack<>();
        int[] rightArr= new int[n];


        for(int i=n-1;i>=0;i--){

            while(!stack.empty() && hist[i]<=hist[stack.peek()]){
                stack.pop();
            }

            if(stack.empty()){
                rightArr[i] = n;
            }

            else if(!stack.empty() && hist[i]>hist[stack.peek()]){

                rightArr[i] = stack.peek();
            }
            stack.push(i);

        }


        Stack<Integer> stack1= new Stack<>();
        int[] leftArr= new int[n];


        for(int i=0; i<n; i++){

            while(!stack1.empty() && hist[i]<=hist[stack1.peek()]){
                stack1.pop();
            }

            if(stack1.empty()){
                leftArr[i] = -1;
            }

            else if(!stack1.empty() && hist[i]>hist[stack1.peek()]){

                leftArr[i] = stack1.peek();
            }
            stack1.push(i);

        }

        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int localArea = Math.abs(hist[i]*(rightArr[i]-leftArr[i]-1));

            if(maxArea<localArea){
                maxArea=localArea;
            }

        }

        return maxArea;



    }
}
