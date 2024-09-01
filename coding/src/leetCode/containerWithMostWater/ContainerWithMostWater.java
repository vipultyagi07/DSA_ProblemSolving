package leetCode.containerWithMostWater;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        Solution solution= new Solution();
        int ans = solution.maxArea(arr);
        System.out.println(ans);

    }
}
class Solution {
    public int maxArea(int[] arr) {

        int i=0,j=arr.length-1;
        int l=0,b=0;
        int maximumArea=0;
        while(i!=j){
            b=j-i;

            if(arr[i]>arr[j]){
                l=arr[j];
                j--;
            }
            else{
                l=arr[i];
                i++;
            }
            if(maximumArea<area(l,b)){
                maximumArea=area(l,b);
            }


        }
        return maximumArea;
    }

    public int area(int h,int w){
        return h*w;
    }
}
