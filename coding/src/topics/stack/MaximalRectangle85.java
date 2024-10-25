package topics.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximalRectangle85 {
    public static void main(String[] args) {

//        char[][] matrix = {
//                {'0', '1', '1', '1'},
//                {'1', '1', '1', '0'},
//                {'0', '0', '1', '1'}
//        };
        char[][] matrix = {
                {'0', '1'}
        };

        SolutionA solutionA= new SolutionA();
        int maxArea = solutionA.maximalRectangle(matrix);
        System.out.println(maxArea);


    }
}


class SolutionA {
    public int maximalRectangle(char[][] matrix) {


        List<int[]> histograms = findAllPossibleHistogram(matrix);

        int maxArea = Integer.MIN_VALUE;

        for(int[] histogram : histograms)  {

            int area = findTheMaxAreaOfHistogram(histogram);

            if(maxArea < area ){
                maxArea= area;
            }



        }


        return maxArea;

    }




    public List<int[]> findAllPossibleHistogram(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int x=0;

        List<int[]> allHistograms = new ArrayList<>();


        int[][] newArr= new int[m][n];

        for(int j=0; j<n; j++){
            newArr[0][j]=newArr[0][j] + toInt(matrix[0][j]);

        }
        allHistograms.add(newArr[0]);


        for(int i=1; i<m; i++){
            int y=0;

            for(int j=0;j<n;j++){

                if(toInt(matrix[i][j])==0){
                    newArr[i][j]=0;
                }
                else{
                    newArr[i][j]=newArr[i-1][j] + toInt(matrix[i][j]);

                }

            }
            allHistograms.add(newArr[i]);


        }
        return allHistograms;

    }

    public int toInt(char c){

        return c-'0';
    }

    public int findTheMaxAreaOfHistogram(int[] histogram){
        int n = histogram.length;
        int[] leftArray = nextSmallerToLeft(histogram);
        int[] rightArray = nextSmallerToRight(histogram);

        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int localArea = Math.abs(histogram[i]*(rightArray[i]-leftArray[i]-1));

            if(maxArea<localArea){
                maxArea=localArea;
            }

        }

        return maxArea;

    }

    public int[] nextSmallerToLeft(int[] hist){
        int n= hist.length;
        int[] leftArr = new int[n];

        Stack<Integer> stack1 = new Stack<>();


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


        return leftArr;

    }

    public int[] nextSmallerToRight(int[] hist){

        int n= hist.length;
        Stack<Integer> stack= new Stack<>();
        int[] rightArr = new int[n];


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

        return rightArr;
    }


}
