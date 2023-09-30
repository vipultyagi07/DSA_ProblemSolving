package prepInstaCoding.ImportantCodesrelatedtoArrays;

public class C1_FindLargestelementinanarray {

    public static void main(String[] args) {
        int a[]={1,5,6,3,8,6,7,5};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("Largest number present in this array "+max);
    }
}
