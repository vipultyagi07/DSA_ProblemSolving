package leetCode.TwoZeroFour.bruteForce;

public class CountPrimes {

    public static void main(String[] args) {
        int x=3;
        countPrimes(x);
    }
    public static int countPrimes(int n) {
        int primeCount=0;

        for(int i=n;i>=2;i--){
            int count=0;

            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                primeCount++;
            }
        }
        return primeCount;
    }
}
