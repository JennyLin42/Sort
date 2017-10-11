package LogicMath;

import java.util.Scanner;

/**
 *
 * 2/1 3/2 5/3 8/5 13/8 21/13...
 * 求随机N到M个数的和
 * 斐波那契数列
 *
 * Created by LINJE2 on 10/10/2017.
 */
public class Logic {
    public static void main(String [] args){
        //System.out.print(getDenominator(8));
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();

        float sum=getSum(start,end);
        System.out.println("sum="+sum);

    }

    private static float getSum(int start, int end) {
        float sum=0;
        if(end<start){
            return -1;
        }
        int a=start;

        float frist=getDenominator(a);
        float secend=getDenominator(++a);

        for(int i=start;i<=end;i++){
            float j=i;
            float k=i;
            sum+=(secend/frist);

            float temp=secend;
            secend=frist+secend;
            frist=temp;
        }

        return sum;
    }

    public static float getDenominator(float n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return getDenominator(n-1)+getDenominator(n-2);
    }
}
