package topics.bitManipulation;

public class CountTheNumberOfSetBit {
    public static void main(String[] args) {
        int n=1023;

        System.out.println(countTheNumberOfBits(n));
        /**
         *  do see this
         */
        System.out.println(OPTIMIZEDcountTheNumberOfBits(n));

    }



    static int countTheNumberOfBits(int n) {
        int count=0;
        while(n!=0){

            if((n&1)==1){
                count +=1;
            }

            n=n>>1;

        }
        return count;
    }

    private static int OPTIMIZEDcountTheNumberOfBits(int n) {
        int count =0;
         while(n!=0){

             n=n&n-1;
             count++;
         }

         return count ;
    }
}
