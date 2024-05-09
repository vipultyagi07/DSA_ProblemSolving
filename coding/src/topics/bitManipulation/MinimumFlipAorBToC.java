package topics.bitManipulation;

public class MinimumFlipAorBToC {

    public static void main(String[] args) {

        System.out.println(minFlips(2,6,5));

    }
    public static int minFlips(int a, int b, int c) {

        int x = a|b;

        int ans = x^c;
        int count=0;

        while(ans!=0){
            ans=ans&(ans-1);
            count++;
        }
        return count;
    }
}
