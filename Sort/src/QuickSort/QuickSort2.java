package QuickSort;

import java.util.Scanner;

/**
 * 快排
 * 自己写啊
 * Created by LINJE2 on 9/22/2017.
 */
public class QuickSort2 {
    public static void main(String []args){
        int[] array = { 49, 38, 65, 97, 76, 13, 27 ,22,77,99};
        sortFrist(array, 0, array.length - 1);
        for(int i=0;i<array.length;i++){
            //System.out.print("aa");
            System.out.print(array[i]+" ");
        }
    }

    public static void sortFrist(int [] array,int low,int high){
        int kep=array[low];

        if(low>=high){
            return;
        }

        for(int i=0;i<array.length;i++){
            //System.out.print("aa");
            System.out.print(array[i]+" ");
        }

        int left = low;
        int right = high;
        //System.out.println("left "+left+"right "+right);


        while(high>low){
            while(high>low && array[high]>=kep){
                --high;
            }
            array[low] = array[high];
            //System.out.println("low "+low+" ");
            while (high>low && array[low]<=kep){
                ++low;
            }
            array[high] = array[low];
        }
        array[low]=kep;

        sortFrist(array,left,low-1);
        sortFrist(array,low+1,right);


    }

}
