package topics.recursion;

public class R7_ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("vipul"));
    }


    /**
     * Reverse a string using recursion
     * <b>Example:</b>
     * <pre>
     * I/P: "vipul"
     * O/P: "lupiv"
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1QiBvktpNj8a-nNted-ph5qJsvrS514g6/view?usp=sharing" target="_blank">For Visualization of stack or tree</a>.
     * </p>
     *
     * @return lupiv
     */

    private static String reverse(String str) {

        if(str.isEmpty() || str.length()==1){
            return str;
        }

        return  reverse(str.substring(1)) + str.charAt(0);
    }
}
