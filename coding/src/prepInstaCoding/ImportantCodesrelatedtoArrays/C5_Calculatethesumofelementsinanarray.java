package prepInstaCoding.ImportantCodesrelatedtoArrays;

import java.util.Arrays;

public class C5_Calculatethesumofelementsinanarray {

    public static void main(String[] args) {
        int a[] = {1, 5, 6, 3, 8, 6, 7, 5};
        int sum = Arrays.stream(a).sum();
        System.out.println("Sum of all element present in the array "+sum);
    }

}
