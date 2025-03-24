package topics.recursion;

public class R10_1_SearchMaxInArray {

    public static void main(String[] args) {
        int a[]={1,2,5,3,8,7};
        int max= Integer.MIN_VALUE;

        System.out.println(search(a,a.length));
    }
    /**
     * Search largest element in an array using recursion.
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: [1,2,5,3,8,7]
     * O/P: 8
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1SfqQ7NoQVrs6q-NULNtMn-BF3-P_PfFg/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */
    private static int search(int[] a, int n) {

        if(n==1){
           return a[0];
        }

        return Math.max(search(a,n-1),a[n-1]);
    }
}
