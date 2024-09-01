package topics.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        long[] arr= {1L,3L, 2L,4L};
        long[] nextLargerElement = Solution.nextLargerElement(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(nextLargerElement[i]);
        }


    }
}

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> stack= new Stack<>();
        long[] list= new long[n];
        int x=n-1;


        for(int i=n-1;i>=0;i--){

            //step 1 check if stack is empty
            if(stack.empty()){
                list[x--]=-1l;
            }
            else if(!stack.empty() && arr[i]<stack.peek()){

                list[x--]=stack.peek();


            }
            else{

                while(!stack.empty() && arr[i]>=stack.peek()){
                    stack.pop();
                }

                if(stack.empty()){
                    list[x--]=-1l;
                }
                else if(!stack.empty() && arr[i]<stack.peek()){

                    list[x--]=stack.peek();

                }
            }

            stack.push(arr[i]);



        }

        return list;
    }
}
