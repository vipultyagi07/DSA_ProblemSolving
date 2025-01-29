package topics.binarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKthRotation {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        list.addAll(Arrays.asList(11,12,15,18,19,20,6,8));
        list.addAll(Arrays.asList(5,1,2,3,4));
        Solution2 solution2= new Solution2();

        System.out.println(solution2.findKRotation(list));

    }
}

class Solution2 {
    public int findKRotation(List<Integer> arr) {


        int start=0, end= arr.size()-1,n=arr.size();

        while(start<=end){

            int mid =start+ (end-start)/2;
            int prev = (mid-1+n)%n;
            int next=(mid+1)%n;


            if(arr.get(mid)<=arr.get(prev) && arr.get(mid)<=arr.get(next)){
                return mid;
            }
            else if(arr.get(end)>=arr.get(mid)){
                end=mid-1;
            }
            else if(arr.get(start)<=arr.get(mid)){
                start=mid+1;
            }




        }
        return 0;
    }
}