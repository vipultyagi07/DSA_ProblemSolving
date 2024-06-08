package leetCode.singleNumberSecond;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumberSecond137 {
    public static void main(String[] args) {
        int[] arr = {5,5,5,7,4,4,4};
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

        int ans=0;


        for(int bit=0;bit<=31;bit++){

            int count=0;
            for(int n=0;n<nums.length;n++){

                if((nums[n]&(1<<bit))!=0){
                    count++;
                }

            }
            if(count%3==1){
                ans=ans|(1<<bit);
            }

        }
        return ans;
    }


}
