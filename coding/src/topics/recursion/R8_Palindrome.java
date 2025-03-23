package topics.recursion;

public class R8_Palindrome {
    public static void main(String[] args) {

        String str= "maadxam";
        System.out.println(palindrome(str,0,str.length()-1));
    }

    /**
     * check if a string is palindrome or not using recursion
     *<b>Example:</b>
     * <pre>
     * I/P: "MAADAAM"
     * O/P: "true
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1RJToqkDKHQH0Whq7GAifBBEYsQWt98l2/view?usp=sharing" target="_blank">For Visualization of stack or tree</a>.
     * </p>
     *
     * @return true
     */


    private static boolean palindrome(String str, int left, int right) {

        if(left>=right){
            return true;
        }

        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }

        return  palindrome(str,left+1,right-1);
    }
}
