package topics.recursion;

public class R5_PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }

    /**
     * Calculates the Sum of an array's element using recursion
     * <b>Example:</b>
     * <pre>
     * I/P: 2,10
     * O/P: 1024
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1Pt5y17Lxn2b5WHXUyyFppa6vb67UnInI/view?usp=sharing" target="_blank">For Visualization of stack or tree</a>.
     * </p>
     *
     * @return 2<sup>10</sup>  = 1024
     */

    private static int power(int a, int n) {

        if(n==0){
            return 1;
        }

        return a*power(a,n-1);

    }
}
