package topics.recursion;

import java.util.Stack;

public class R13_SortStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(6);

        sortStack(stack);
        System.out.println(stack);
    }

    private static void sortStack(Stack<Integer> stack) {

        if(stack.size()==1){
            return;
        }

        int value = stack.pop();

        sortStack(stack);

        insert(stack,value);
    }

    private static void insert(Stack<Integer> stack, int value) {



        if(stack.size()==0 || stack.peek()<= value){
            stack.push(value);
            return;
        }

        int temp = stack.pop();

        insert(stack,value);
        stack.push(temp);

    }
}
