package InsertionSort;

/**
 * 二元选择排序(还没打完)
 * 简单选择排序 每趟循环只能确定一个元素排序后的定位
 * 经过改进之后 每次确定最小和最大值的位置
 * Created by LINJE2 on 9/15/2017.
 */
public class TwoSelectionSort {
    public static void main(String[] args){
        int[] a=new int[]{2,1,4,7,2,6,10,8,9};

        for(int i=0;i<a.length/2;i++){
            int max=i;  //记录最大值的位置
            int min=i;  //记录最小值的位置
            for(int j=i+1;j<a.length-i;j++){
                if(a[max]<a[j]){
                    max=j;
                }
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;

            temp=a[a.length-i-1];
            a[a.length-i-1]=a[max];
            a[max]=temp;

            for(int ii=0;ii<a.length;ii++){
                System.out.print(a[ii]+" ");
            }
            System.out.println("");
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
