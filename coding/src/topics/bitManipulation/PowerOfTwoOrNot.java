package topics.bitManipulation;

public class PowerOfTwoOrNot {

    public static void main(String[] args) {
        int n=0;

        System.out.println(powerOfTwo(n));

    }



    static boolean powerOfTwo(int n) {
        // Write your code here
        return (n&(n-1))==0;
    }
}
