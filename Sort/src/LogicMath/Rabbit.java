package LogicMath;

import java.math.BigDecimal;

/**
 * Created by LINJE2 on 10/11/2017.
 * 題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 *
 */
public class Rabbit {

    public  static void main(String [] args){
        rabbitNum(10);
    }

    private static int rabbitNum(int n) {
        for(int i=0;i<n;i++){
            int b=i/3;
            System.out.println(new BigDecimal(Math.pow(2,++b)));
        }

        return 1;
    }
}
