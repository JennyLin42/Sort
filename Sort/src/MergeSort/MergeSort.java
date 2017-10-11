package MergeSort;
import java.util.Scanner;

/**
 * 教程网址 http://www.cnblogs.com/jingmoxukong/p/4308823.html
 *
 *
 * 归并排序 稳定
 * Created by LINJE2 on 9/25/2017.
 * 分治思想
 * 输入一个数值 也就是数值的长度
 * 再输入一串字符 用空格隔开 就是数组
 * 最后输入排序之后的数组
 *
 * input：
 * 3
 * 5 2 4
 * output：
 * 2 4 5
 *
 */
public class MergeSort {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        String len=sc.nextLine();
        //System.out.println("w".charAt(0)+0);
        String str=sc.nextLine();
        //String[] strArray=str.split(" ");
        //System.out.println(str);
        String[] array=str.split(" ");
        int str_length=array.length;

        int [] arr=new int[array.length];
        for(int i=0 ; i < str_length ; i++){
            arr[i]=Integer.parseInt(array[i]);
        }

        int [] array1=sort(arr);
        for(int i=0 ; i < str_length ; i++){
            System.out.print(array1[i]+" ");
        }




    }

    public static void MergePass(int[] array, int gap, int length) {
        int i = 0;

        // 归并gap长度的两个相邻子表
        for (i = 0; i + 2 * gap - 1 < length; i = i + 2 * gap) {
            Merge(array, i, i + gap - 1, i + 2 * gap - 1);
        }

        // 余下两个子表，后者长度小于gap  如果子数组是基数
        if (i + gap - 1 < length) {
            Merge(array, i, i + gap - 1, length - 1);
        }
    }

    public static int[] sort(int[] list) {
        for (int gap = 1; gap < list.length; gap = 2 * gap) {
            MergePass(list, gap, list.length);
            System.out.print("gap = " + gap + ":\t");
        }
        return list;
    }

    //将两个有序数组从小到大排列
    public static void Merge(int[] array, int low, int mid, int high) {
        int i = low; // i是第一段序列的下标
        int j = mid + 1; // j是第二段序列的下标
        int k = 0; // k是临时存放合并序列的下标
        int[] array2 = new int[high - low + 1]; // array2是临时合并序列

        // 扫描第一段和第二段序列，直到有一个扫描结束
        while (i <= mid && j <= high) {
            // 判断第一段和第二段取出的数哪个更小，将其存入合并序列，并继续向下扫描
            if (array[i] <= array[j]) {
                array2[k] = array[i];
                i++;
                k++;
            } else {
                array2[k] = array[j];
                j++;
                k++;
            }
        }

        // 若第一段序列还没扫描完，将其全部复制到合并序列
        while (i <= mid) {
            array2[k] = array[i];
            i++;
            k++;
        }

        // 若第二段序列还没扫描完，将其全部复制到合并序列
        while (j <= high) {
            array2[k] = array[j];
            j++;
            k++;
        }

        // 将合并序列复制到原始序列中
        for (k = 0, i = low; i <= high; i++, k++) {
            array[i] = array2[k];
        }
    }
}
