package myQuestion.countPair;

public class CountPair {

    public static void main(String[] args) {
        int a[] = {2,3,5,6};
        int b[] = {2,2, 4, 4, 8};
        int answer = countThePair(a,b);

        System.out.println("Total number of valid pairs: "+answer);


    }


    public static int countThePair(int[] a, int[]b){

        int left=0;
        int right=0;

        int count=0;
        int n=a.length;

        while(left<a.length && right<b.length){

            if(a[left]>b[right]){
                right++;
                count= count + (n-left);
            }
            else {
                left++;
            }
        }
        return count;
    }
}
