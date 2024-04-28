package topics.bitManipulation;

public class ClearNthBit {
    public static void main(String[] args) {

        System.out.println(clearKthBit(9,2));

    }

    static int clearKthBit(int n, int k) {
        // Write your code here

        int i= n & (~(1<<k));
        return i;
    }
}
