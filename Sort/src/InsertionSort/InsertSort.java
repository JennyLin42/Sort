package InsertionSort;

/**
 * 插入排序(稳定排序)
 * 后面的如果小于前面的，前面的全部退后，然后让最小的插入到合适的位置
 * Created by LINJE2 on 9/15/2017.
 */
public class InsertSort {
    public static void main(String[] args){
        int[] a=new int[]{2,1,4,7,2,6,10,8,9};

        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                int temp=a[i];
                int j=i-1;
               // a[i]=a[i-1];
                while(j>=0 && temp<a[j]){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=temp;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
