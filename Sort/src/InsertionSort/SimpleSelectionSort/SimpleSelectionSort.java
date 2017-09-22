package InsertionSort.SimpleSelectionSort;

/**
 * 简单选择排序（应该是稳定排序）
 * 每一步都能确定一个数值的所在位置 最快能知道某个数值的位置在哪里
 * 每趟循环只能确定一个元素排序后的定位
 * Created by LINJE2 on 9/15/2017.
 */
public class SimpleSelectionSort {
    public static void main(String[] args){
        int[] a=new int[]{2,1,4,7,2,6,10,8,9};

        for(int i=0;i<a.length;i++){
            int temp=a[i];
            //每一步寻找最小的数值
            int k=i;
            for(int j=i+1;j<a.length;j++){
                if(temp>a[j]){
                    temp=a[j];
                    k=j;
                }
            }
          //  System.out.print(temp);
            if(k!=i){
                int temp2=a[i];
                a[i]=temp;
                a[k]=temp2;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
