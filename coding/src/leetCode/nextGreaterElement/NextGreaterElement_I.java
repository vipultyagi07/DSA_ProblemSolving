package leetCode.nextGreaterElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement_I {

    public static void main(String[] args) {

        int[] nums1= {4,1,2};
        int[] nums2={1,3,4,2};
        int[] ans = Solution1.nextGreaterElement(nums1, nums2);
        for(int i=0 ; i<nums1.length;i++){
            System.out.print(ans[i]);
        }
    }
}

class Solution1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> ansMap= new HashMap<>();


        for(int i=nums2.length-1 ; i>=0 ; i--){

            if(stack.empty()){
                ansMap.put(nums2[i],-1);
            }
            else if(!stack.empty() && nums2[i]<stack.peek()){
                ansMap.put(nums2[i],stack.peek());
            }
            else{

                while(!stack.empty() && nums2[i]>=stack.peek()){
                    stack.pop();
                }

                if(stack.empty()){
                    ansMap.put(nums2[i],-1);
                }
                else if(!stack.empty() && nums2[i]<stack.peek()){
                    ansMap.put(nums2[i],stack.peek());
                }


            }
            stack.push(nums2[i]);

        }

        int[] ansArr= new int[nums1.length];

        for(int i=0;i<nums1.length;i++){

            ansArr[i]=ansMap.get(nums1[i]);

        }

        return ansArr;

    }
}
