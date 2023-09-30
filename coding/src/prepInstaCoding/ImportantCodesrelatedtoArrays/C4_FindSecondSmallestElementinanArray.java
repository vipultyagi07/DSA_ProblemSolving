package prepInstaCoding.ImportantCodesrelatedtoArrays;

public class C4_FindSecondSmallestElementinanArray {

    public static void main(String[] args) {
        int a[]={1,5,6,3,8,6,9,7,5};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]==min){
                continue;
            }
            if(a[i]<min2){
                min2=a[i];
            }

        }

        System.out.println("Second Smallest number present in this array using two loop but with O(n) TC is  "+min2);
        System.out.println("Second Smallest number present in this array using One loop  with O(n) TC is  "+secondMinimun(a));
    }

    static int secondMinimun(int arr[]){

        int first_min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;

        for (int i=0; i < arr.length; i++){
            if(arr[i] < first_min)
            { second_min = first_min;
                first_min = arr[i];
            }
            else if(arr[i]<second_min)
            {
                second_min = arr[i];
            }
        }

        return second_min;
    }
}
