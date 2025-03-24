package topics.recursion;

public class R11_CountTheOccurrences {
    public static void main(String[] args) {

        int a[]= {1,2,4,2};
        int target = 2;
        int count =0;


        System.out.println(countOccurrences(a,0,count,target));

    }

    private static int countOccurrences(int[] a, int i, int count, int target) {

        if(i==a.length){
            return count;
        }

        if(target==a[i]){
            count++;
        }

        return countOccurrences(a,i+1,count,target);

    }
}
