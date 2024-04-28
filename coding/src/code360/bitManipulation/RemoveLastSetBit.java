package code360.bitManipulation;

public class RemoveLastSetBit {

    public static void main(String[] args) {
        int n=12;

        System.out.println(removeLastSetBit(n));

    }



    static int removeLastSetBit(int n) {
        // Write your code here
        return n&(n-1);
    }
}
