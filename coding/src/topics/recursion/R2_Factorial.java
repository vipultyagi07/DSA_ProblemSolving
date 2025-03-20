package topics.recursion;

public class R2_Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    private static int factorial(int n) {

        if(n==0){
            return 1;
        }
        int fact = n*factorial(n-1);

        return fact;
    }
}
