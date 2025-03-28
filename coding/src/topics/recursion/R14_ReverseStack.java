package topics.recursion;

import java.util.Stack;

public class R14_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(6);

        reverseStack(stack);
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {

        if(stack.size()==0){
            return;
        }
        int temp = stack.pop();

         reverseStack(stack);

         insertAtBottom(stack,temp);
    }

    private static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, value);
        stack.push(temp);
    }
}
