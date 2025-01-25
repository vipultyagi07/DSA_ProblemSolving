package leetCode.insertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {

    public static void main(String[] args) {

//        int a[][]= {{1,2},{3,5},{6,7},{8,10},{12,16}};
//        int b[] = {4,8};

//        int a[][]= {{1,4},{7,9}};
//        int b[] = {4,7};

        int a[][]= {{1,5}};
        int b[] = {2,7};

        Solution solution = new Solution();
        int c[][]= solution.insertInterval(a,b);




    }
}

class Solution {



    public int[][] insertInterval(int[][] intervals, int[] b) {

        if(intervals.length==0){

            int[][] arr= new int[1][];
            arr[0]=b;

            return arr ;
        }

        List<int[]> allIntervals = new ArrayList<>();


        addNewIntervalInList(intervals, b, allIntervals);


        List<int[]> result = new ArrayList<>();
        int[] newInterval = allIntervals.get(0);

        result.add(newInterval);


        for(int[] pair :allIntervals){


            if(pair[0]<=newInterval[1]){

                newInterval[1]= Math.max(newInterval[1],pair[1]);

            }
            else{

                newInterval=pair;
                result.add(newInterval);

            }
        }

        int[][] array = result.toArray(new int[result.size()][]);
        return array;


    }

    private static void addNewIntervalInList(int[][] intervals, int[] b, List<int[]> allIntervals) {
        boolean flag=true;

        for(int[] interval: intervals){

            if(b[0]<interval[0] && flag ){
                allIntervals.add(b);
                flag=false;
            }
            allIntervals.add(interval);


        }

        if(flag){
            allIntervals.add(b);
        }
    }
}
