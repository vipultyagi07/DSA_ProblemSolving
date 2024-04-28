package code360.bitManipulation;

public class ToggleIthBit {

    public static void main(String[] args) {
        int n=13;
        int k=1;

        System.out.println(toggleIthBit(n,k));

        System.out.println(toggleIthBitOtherApproach(n,k));

    }



    static int toggleIthBit(int n, int k) {
        // Write your code here

       if((n&(1<<k))!=0){
           return n&(~(1<<k));
       }
       else{
           return n|(1<<k);
       }
    }

     static int toggleIthBitOtherApproach(int n, int i) {

        return n^(1<<i);
    }
}
