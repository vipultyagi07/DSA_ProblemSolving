package topics.recursion;

public class R4_ArraySum {
    public static void main(String[] args) {

        int a[] = {1,2,8,4,5};

        System.out.println(arraySum(a,a.length));
    }

    /**
     * Calculates the Sum of an array's element using recursion
     * <b>Example:</b>
     * <pre>
     * I/P: [1,2,8,4,5]
     * O/P: 20
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1PSXoEk4tlZkEZpxvN1NlHWXK39voi94O/view?usp=sharing" target="_blank">For Visualization of stack or tree</a>.
     * </p>
     *
     * @return the sum of all numbers present in the array
     */
    private static int arraySum(int[] arr, int n) {

        if(n==0){
            return 0;
        }

        return arr[n-1]+arraySum(arr,n-1);
    }
}
