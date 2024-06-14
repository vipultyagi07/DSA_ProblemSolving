package topics.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D_Anagram_Count {

    public static void main(String[] args) {

        Solution solution= new Solution();
        int search = solution.search("aaba", "aabaabaa");
        System.out.println(search);

    }
}

// User function Template for Java

class Solution {

    int search(String pat, String txt) {

        int N=txt.length();
        int K=pat.length();
        int start_index=0;
        int end_index=0;
        Utilty utilty= new Utilty();

        Map<Character,Integer> map = utilty.addStringToMap(pat);
        int count=map.size();
        int answer=0;


        while(end_index<N){
            char c=txt.charAt(end_index);
            //calculation
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    count--;
                }

            }

            if(end_index-start_index+1<K){
                end_index++;
            }

            else if(end_index-start_index+1==K){

                if(count==0){
                    answer++;
                }

                if(map.containsKey(txt.charAt(start_index))){

                    map.put(txt.charAt(start_index),map.get(txt.charAt(start_index))+1);
                    if(map.get(txt.charAt(start_index))==1){
                        count++;

                    }


                }
                start_index++;
                end_index++;


            }


        }
        return answer;
    }
}

class Utilty{

    public Map<Character,Integer> addStringToMap(String txt){
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<txt.length();i++){

            char c=txt.charAt(i);

            if(map.containsKey(c)){
                int freq = map.get(c);
                map.put(c,freq+1);
            }
            else{

                map.put(c,1);
            }

        }
        return map;
    }
}