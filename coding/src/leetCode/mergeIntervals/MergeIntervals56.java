package leetCode.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    public static void main(String[] args) {

        Solution solution= new Solution();

        int a[][]= {{1,3},{8,10},{15,18},{2,6}};
        solution.merge(a);

    }
}

class Solution {

int[][] merge(int[][] intervals) {

    // Step 1: Check if the input has one or no intervals
    if (intervals.length <= 1)
        return intervals;

    // Step 2: Sort by ascending starting point
//    Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
    Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));

    List<int[]> result = new ArrayList<>();

    // Initialize the first interval to merge
    int[] newInterval = intervals[0];
    result.add(newInterval);

    // Step 3: Iterate through the sorted intervals
    for (int[] interval : intervals) {
        if (interval[0] <= newInterval[1]) {
            // Overlapping intervals, update the end if needed
            newInterval[1] = Math.max(newInterval[1], interval[1]);
        } else {
            // Disjoint intervals, add the new interval to the list
            newInterval = interval;
            result.add(newInterval);
        }
    }

    // Step 4: Convert the result list to a 2D array
    return result.toArray(new int[result.size()][]);
}
}
