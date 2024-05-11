package leetCode.SingleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber136 {

    public static void main(String[] args) {
        int[] arr = {2,1,3,1,4,4,2};
        // brute force
        System.out.println(singleNumber(arr));
        // optimized
        System.out.println(singleNumberOptimized(arr));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer,Integer> frequencyMap= new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if(frequencyMap.containsKey(nums[i])){
                int freq=frequencyMap.get(nums[i])+1;
                frequencyMap.put(nums[i],freq);
            }
            else{
                frequencyMap.put(nums[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = frequencyMap.entrySet();
        int value=0;
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){

            if(entry.getValue()==1){
                value = entry.getKey();
                break;
            }
        }
        return value;
    }

    public static int singleNumberOptimized(int[] nums) {

         int xor=0;
        for(int i=0;i< nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
