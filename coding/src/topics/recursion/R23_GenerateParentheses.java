package topics.recursion;
import java.util.*;

public class R23_GenerateParentheses {
    public static void main(String[] args) {

        Solutionx solution = new Solutionx();

        System.out.println(solution.generateParenthesis(3));

    }
}



/**
 * print all permutation with Letter case change of a String using recursion's Input output method .
 * <p>
 * <b>Example:</b>
 * <pre>
 * <a href="https://leetcode.com/problems/generate-parentheses/description//" target="_blank">LeetCode 22</a>.
 * I/P: 3
 * O/P: [((())), (()()), (())(), ()(()), ()()()]
 * </pre>
 * </p>
 * <p>
 * For more details, refer to:
 * <a href="https://drive.google.com/file/d/1FFNauIjmu4XxYPnbvrjkfDJx97UAeMEy/view?usp=sharing" target="_blank">For Visualization</a>.
 * </p>
 *
 */
class Solutionx {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("", n, n, result);
        return result;
    }

    private void solve(String output, int open, int close, List<String> result) {
        if (open == 0 && close == 0) {
            result.add(output);
            return;
        }

        if (open > 0) {
            solve(output + "(", open - 1, close, result);
        }

        if (close > open) {
            solve(output + ")", open, close - 1, result);
        }
    }
}

