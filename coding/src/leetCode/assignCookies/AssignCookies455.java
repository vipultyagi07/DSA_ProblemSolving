package leetCode.assignCookies;

import java.util.Arrays;

public class AssignCookies455 {

    public static void main(String[] args) {

        int g[]={1,5,3,3,4};
        int s[]={4,2,1,2,1,3};

        Solution solution= new Solution();

        int contentChildren = solution.findContentChildren(g, s);

        System.out.println(contentChildren);
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int count = 0;
        Arrays.sort(s);

        for(int i=0;i<g.length;i++){

            for(int j=0;j<s.length;j++){
                if(g[i]<=s[j]){
                    count++;
                    s[j]=0;
                    break;
                }
            }
        }

        return count;

    }
}
