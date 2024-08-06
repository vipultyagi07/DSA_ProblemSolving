package GFG;

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        Solutions.print_divisors(12);

    }
}
class Solutions {
    public static void print_divisors(int n) {
        // code here
        int x= (int)Math.sqrt(n);
        int i;
        if(n==2 || n==3){
            System.out.print("1"+" "+n);
            return;
        }

        for(i=1;i<=x;i++){
            if(n%i==0){

                System.out.print(i+" ");
            }
        }
        if((i-n/i)==1){
            i--;
        }
        else{
            i=x-1;
        }
        for(;i>=1;i--){

            if(n%i==0)
                System.out.print(n/i+" ");

        }




    }
}


