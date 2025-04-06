package topics.recursion;


import java.util.*;

public class R17_TowerOfHanoi {

    static int step = 1;

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'B', 'C'); // A = From, B = To, C = Helper
    }



    /**
     * Tower of hanoi using recursion.
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: number of disk n
     * O/P: print the steps of disk moving
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1HTUJq5kGXXzGleB6tE0jgfak7khPN3_e/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */
    public static void solveHanoi(int n, char from, char to, char helper) {
        if (n == 1) {
            System.out.println("Step " + step++ + ": Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move n-1 disks from source to helper
        solveHanoi(n - 1, from, helper, to);

        // Move nth disk from source to destination
        System.out.println("Step " + step++ + ": Move disk " + n + " from " + from + " to " + to);

        // Move n-1 disks from helper to destination
        solveHanoi(n - 1, helper, to, from);
    }
}

