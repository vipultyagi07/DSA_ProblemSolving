package topics.stack;

import java.util.Stack;

public class DailyTemperatures739 {
    public static void main(String[] args) {
        int[] arr= {73,74,75,71,69,72,76,73};
        SolutionY solution= new SolutionY();

        solution.dailyTemperatures(arr);
    }
}

class SolutionY {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] arr= new int[n];
        int x = n-1;

        for(int i = n-1 ; i>=0 ; i--){

            while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]){
                stack.pop();
            }

            arr[x--] = stack.isEmpty() ? (n- (i+1)) : stack.peek()-i;
            stack.push(i);

        }

        return arr;
    }
}
