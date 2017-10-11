package QuickSort;

/**
 * Created by LINJE2 on 9/22/2017.
 * 快速排序 平均时间复杂度 n*logn  不稳定
 * 但是不够稳定 据说在实际应用中最快的一种算法
 * 如果数组刚好是倒序的 时间复杂度会回退到冒泡排序
 */
public class QuickSort {
    public static void main(String [] args){

//        int[] a=new int[]{5,6,4,8,9,2,1,3,7};
//        sortFrist(a,0,a.length-1);

        int[] array = { 49, 38, 65, 97, 76, 13, 27 };
        sort(array, 0, array.length - 1);
        for(int i=0;i<array.length;i++){
            //System.out.print("aa");
            System.out.print(array[i]+" ");
        }
        //System.out.println(array.toString());
    }

    public static int sortFrist(int[] array,int low,int high){
        int key = array[low];
        while (low < high)
        {
                /*从后向前搜索比key小的值*/
            while (array[high] >= key && high > low)
                --high;
                /*比key小的放左边*/
            array[low] = array[high];
                /*从前向后搜索比key大的值，比key大的放右边*/
            while (array[low] <= key && high > low)
                ++low;
                /*比key大的放右边*/
            array[high] = array[low];
        }
            /*左边都比key小，右边都比key大。//将key放在游标当前位置。//此时low等于high */
        array[low] = key;

        return high;
    }


    public static void sort(int[] array, int low, int high)
    {
        if (low >= high)
            return;
            /*完成一次单元排序*/
        int index = sortFrist(array, low, high);
        System.out.println("index"+index);
            /*对左边单元进行排序*/
        sort(array, low, index - 1);
            /*对右边单元进行排序*/
        sort(array, index + 1, high);
    }
}

