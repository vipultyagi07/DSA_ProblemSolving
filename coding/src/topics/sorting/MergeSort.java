package topics.sorting;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr={1,2,4,3,6,5};
        Solution solution= new Solution();
        solution.mergeSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}



/**
 * Sort an array using merge sort in O(n log n).
 * <p>
 * <b>Example:</b>
 * <pre>
 * <a href="https://www.naukri.com/code360/problems/merge-sort_920442?leftPanelTabValue=PROBLEM" target="_blank">Coding Ninja</a>.
 * I/P: [1,2,4,3,6,5]
 * O/P: [1,2,3,4,5,6]
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/163yLg_d2vrNG6xXl1MUQ6GmbFF4FrNU7/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */

class Solution {

    public  void mergeSort(int[] arr, int l, int r) {
        if(l==r){
            return;
        }

        int m = l + (r - l) / 2;

        // Sort first and second halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the sorted halves
        merge(arr, l, m, r);

    }

    // Merges two subarrays of arr[]
    public  void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

}
