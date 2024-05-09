package topics.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        int n= nums.length;
        System.out.println(n);
        int N=(1<<n);
        List<List<Integer>> mainIndexList= new ArrayList<>();

        for(int num=0;num<N;num++){

            List<Integer> setIndex= new ArrayList<>();
            for(int j=0;j<n;j++){
                if((num & (1<<j))!=0){
                    setIndex.add(nums[j]);
                }
            }
            mainIndexList.add(setIndex);
        }


        return mainIndexList;

    }
}

