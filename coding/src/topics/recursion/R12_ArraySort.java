package topics.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R12_ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,5,3,2,6,4);


        sort(list);
        System.out.println(list);


    }

    /**
     * Sort an array using recursion.
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: [1,5,3,2,6,4]
     * O/P: [1,2,3,4,5,6]
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1-OW6ING64qObQ2epueQGgifa2-hdgfD3/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */

    private static void sort(List<Integer> list) {
        if(list.size()==1){
            return;
        }

        int value= list.remove(list.size()-1);

        sort(list);

        insert(list,value);

    }

    private static void insert(List<Integer> list, int value) {

        if(list.size()==0 || list.get(list.size()-1)<=value){
            list.add(value);
            return;
        }

        int temp = list.remove(list.size()-1);
        insert(list,value);

        list.add(temp);
    }
}
