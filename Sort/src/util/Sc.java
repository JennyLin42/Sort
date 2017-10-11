package util;

import java.util.Scanner;

/**
 * nextLine 和next 的区别
 * Created by LINJE2 on 9/26/2017.
 * nextLine 会将回车当作一行
 * next 在一个实际的字符之后才开始算一行 如果前面包含回车或者空格 都不算是next的输入信息 而且以一个实际的字符结束。。输入的时候中间就不能有空格或者其他了
 */
public class Sc {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        String str=sc.nextLine();
        System.out.println(str);

        //-----------------------------
//        Scanner sc =new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//        String str=sc.next();
//        System.out.println(str);
    }

}
