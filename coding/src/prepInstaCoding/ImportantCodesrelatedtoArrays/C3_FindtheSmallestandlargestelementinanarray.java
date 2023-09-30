package prepInstaCoding.ImportantCodesrelatedtoArrays;

public class C3_FindtheSmallestandlargestelementinanarray {

    public static void main(String[] args) {
        int a[]={1,5,6,3,8,6,7,5};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println("Largest number present in this array "+max);
        System.out.println("Smallest number present in this array "+min);
    }
}
