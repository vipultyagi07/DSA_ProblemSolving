package leetCode.vaildParenthesis;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {

        System.out.println(isValid("(})"));
        System.out.println(isValidOptimized("({{}})"));

    }



    public static boolean isValid(String s) {
        int j=s.length()-1;

        while(true){
            if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else if(s.contains("()")){
                s=s.replace("()","");
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else{
                return s.isEmpty();
            }
        }
    }
    private static boolean isValidOptimized(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push( '}');
            }
            else if (c == '(') {
                stack.push( ')');
            }
            else if (c == '[') {
                stack.push( ']');
            }
            else if(stack.empty() || stack.pop()!=c){
                return  false;
            }
        }

        return stack.empty();

    }

//    private static boolean compareCharacter(char c, Stack<Character> stack) {
//        c=convertInputChar(c);
//
//        if(c==stack.peek()){
//            return true;
//        }
//        return false;
//    }
//
//    private static char convertInputChar(char c) {
//        if (c == '{') {
//            return '}';
//        }
//        if (c == '(') {
//            return ')';
//        }
//        if (c == '[') {
//            return ']';
//        }
//        return c;
//    }

}
