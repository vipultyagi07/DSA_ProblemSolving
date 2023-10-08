package slidingWindow;

public class F1_MaximumSumInSubArrayOfSizeK {

    public static void main(String[] args) {
        int arr[] = {99, 4, 8, 0, 5, 6, 3};
        //         0  1  2  3  4  5  6
        int k = 3; // Size of the subarray

        int i = 0; // Start of the subarray
        int j = 0; // End of the subarray
        int sum = 0; // Current sum of the subarray
        int max = 0; // Maximum sum of a subarray of size k

        // Iterate through the array using the two-pointer technique
        while (j < arr.length) {
            sum = sum + arr[j]; // Add the current element to the sum // logic area

            if (j - i + 1 < k) {
                // If the subarray size is less than k, move the 'j' pointer to the right
                j++;
            } else if (j - i + 1 == k) {
                // If the subarray size is equal to k, calculate the maximum sum and move the 'i' pointer to the right
                if (max < sum) {
                    max = sum;
                }
                sum = sum - arr[i]; // Remove the element at 'i' from the sum
                i++; // Move the 'i' pointer to the right
                j++; // Move the 'j' pointer to the right to continue sliding the window
            }
        }

        System.out.println("Maximum sum of a subarray of size 3 is " + max);
    }
}
