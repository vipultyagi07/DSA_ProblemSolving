package topics.bitManipulation;

public class SetIthBit {
    public static void main(String[] args) {

        System.out.println(setKthBit(9,2));

    }

    static int setKthBit(int n, int k) {
        // Write your code here

        int i = n | (1 << k);
        return i;
    }
}
