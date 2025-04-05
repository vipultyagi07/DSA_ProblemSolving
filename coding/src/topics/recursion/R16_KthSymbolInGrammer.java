package topics.recursion;

public class R16_KthSymbolInGrammer {
    public static void main(String[] args) {
        int n=5, k=16;

        int answer  = searchK(n,k);
        System.out.println(answer);


    }

    private static int searchK(int n, int k) {

        if(n==1){
            return 0;
        }

        if(k<=((int)Math.pow(2,n-1))/2){
            return searchK(n-1,k);
        }
        else{
            return searchK(n-1,k-((int)Math.pow(2,n-1))/2)^1;
        }

    }


}
