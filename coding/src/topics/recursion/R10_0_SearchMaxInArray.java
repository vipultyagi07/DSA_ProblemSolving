package topics.recursion;

public class R10_0_SearchMaxInArray {

    public static void main(String[] args) {
        int a[]={1,2,5,3,8,7};
        int max= Integer.MIN_VALUE;

        System.out.println(search(a,a.length-1,max));
    }

    private static int search(int[] a, int i, int max) {

        if(i<0){
           return max;
        }

        if(a[i]>max){
            max= a[i];
        }

        return search(a,i-1,max);
    }
}
