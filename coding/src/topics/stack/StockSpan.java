package topics.stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {

        int[] arr= {68,735, 101, 770, 525, 279, 559, 563, 465, 106, 146, 82, 28, 362, 492, 596, 743, 28, 637};
        int[] ints = SolutionZ.calculateSpan(arr, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(ints[i]+" ");
        }


    }
}


class SolutionZ {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[n];

        // Process each day's stock price
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the price at current day is greater than the price at top of stack
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();  // Pop the index because its price is lower
            }

            // If the stack becomes empty, it means no previous higher stock price, so span is (i + 1)
            // Otherwise, calculate the span as the difference between current index and top of stack
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push the current index onto the stack
            stack.push(i);
        }
        return span;
    }
}
