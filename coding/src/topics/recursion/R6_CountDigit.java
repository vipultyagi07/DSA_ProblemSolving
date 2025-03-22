package topics.recursion;

public class R6_CountDigit {
    public static void main(String[] args) {

        System.out.println(count(4568));

    }

    /**
     * Count the digit of a number using recursion
     * <b>Example:</b>
     * <pre>
     * I/P: 4568
     * O/P: 4
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1QFd8orwCwERY1WC6LtFmGEcR3e077DpB/view?usp=sharing" target="_blank">For Visualization of stack or tree</a>.
     * </p>
     *
     * @return 4
     */

    private static int count(int n) {

        if(n==0){
            return 0;
        }

        return 1+ count(n/10);
    }
}
