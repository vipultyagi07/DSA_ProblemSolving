package topics.recursion;

public class R3_Fibonaaci_1 {

    public static void main(String[] args) {

        System.out.println(fibonacci(6));

    }


    /**
     * Calculates the Fibonacci number at the given position.
     * <p>
     * <img src="https://i0.wp.com/oscarenfotos.com/wp-content/uploads/2019/04/leonardo_pisano.jpg?w=900&ssl=1" alt="Portrait of Leonardo Fibonacci" width="200"/>
     * </p>
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: 6
     * O/P: 8
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1NosFbGgT6mSgZupLtTUiffP1_SVXm6pX/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     * @param n the position in the Fibonacci sequence (0-based index)
     * @return the Fibonacci number at the given position
     */
    private static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
