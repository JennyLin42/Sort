package Back_0_1;

/**
 * 教程网址 http://shmilyaw-hotmail-com.iteye.com/blog/2009761
 *
 * 0-1 背包问题 时间复杂度为O(nw) W为常数也可以是 时间复杂度为O(n)
 * Created by LINJE2 on 9/27/2017.
 */
public class DynamicKnapSack {
    private int[] v;
    private int[] w;
    private int[][] c;
    private int weight;

    public DynamicKnapSack(int length, int weight, int[] vin, int[] win) {
        v = new int[length + 1];
        w = new int[length + 1];
        c = new int[length + 1][weight + 1];
        this.weight = weight;
        for(int i = 0; i < length + 1; i++) {
            v[i] = vin[i];
            w[i] = win[i];
        }
    }

    public void solve() {
        for(int i = 1; i < v.length; i++) {
            for(int k = 1; k <= weight; k++) {
                if(w[i] <= k) {
                    if(v[i] + c[i - 1][k - w[i]] > c[i - 1][k])
                        c[i][k] = v[i] + c[i - 1][k - w[i]];
                    else
                        c[i][k] = c[i - 1][k];
                } else
                    c[i][k] = c[i - 1][k];
            }
        }
    }

    public void printResult() {
        for(int i = 0; i < v. length; i++) {
            for(int j = 0; j <= weight; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] v = {0, 60, 100, 120};
        int[] w = {0, 10, 20, 30};
        int weight = 50;
        DynamicKnapSack knapsack = new DynamicKnapSack(3, weight, v, w);
        knapsack.solve();
        knapsack.printResult();
    }
}