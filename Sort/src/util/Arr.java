package util;

import java.util.Arrays;

/**
 * Created by LINJE2 on 9/26/2017.
 */
public class Arr {
    public static void main(String [] args){
        int [] array1=new int[]{3,2,5,7};
        //List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
