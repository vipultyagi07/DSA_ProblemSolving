package GFG;

import java.util.Stack;

public class SmallerOnLeft {
    public static int[] findSmallerOnLeft(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from stack that are greater than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no smaller element exists on the left
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 2, 5, 5, 4, 2, 5};
        int n = arr.length;
        int[] result = findSmallerOnLeft(arr, n);

        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
