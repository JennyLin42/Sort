package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LINJE2 on 9/26/2017.
 * 冒泡排序 稳定
 */
public class BubbleSort {
    public static void main(String [] args){
        int [] array=new int[]{3,2,5,7,10,5,22,11};

        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
