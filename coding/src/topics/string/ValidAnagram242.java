package topics.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {


    public static void main(String[] args) {

        String s= "ab";
        String t= "a";

        System.out.println(isValidAnagram(s,t));
    }

    private static boolean isValidAnagram(String s, String t) {


        char[] sourceArray = s.toCharArray();
        char[] targetArray = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();



        for(int i=0 ;i<s.length() ; i++){

            if(map.containsKey(sourceArray[i])){

                map.put(sourceArray[i],map.get(sourceArray[i])+1);
            }
            else{
                map.put(sourceArray[i],1);
            }
        }
        int count=0;
        for(int i=0 ;i< t.length();i++){

            if(map.containsKey(targetArray[i]) && map.get(targetArray[i])!=0){
                map.put(targetArray[i], map.get(targetArray[i])-1);
                count++;
            }

        }

        if(count==t.length()){
            return true;
        }
        else{
            return false;
        }



    }
}
