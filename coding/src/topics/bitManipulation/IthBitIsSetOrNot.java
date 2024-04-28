package topics.bitManipulation;

public class IthBitIsSetOrNot {
    public static void main(String[] args) {

        System.out.println(isKthBitSet(13,2));

    }

    static boolean isKthBitSet(int n, int k) {
        // Write your code here

        if(((n>>k)&1)!=0){
            return true;
        }
        else {
            return false;

        }
    }
}
