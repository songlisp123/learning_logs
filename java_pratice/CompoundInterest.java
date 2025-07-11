import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        //获取键盘输出
        Scanner in = new Scanner(System.in);
        //获取本金
        System.out.print("你想投资多少本金？");
        double b = in.nextDouble();
        //利率常量
        final double STARTRATE = 1;
        final int NRATE= 8;
        final int NYEARS = 10;
        //将利率提升至10~15%
        double[] interestRate = new double[NRATE];
        for (int i=0;i<interestRate.length;i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }
        //创建本金二维数组
        double[][] balances = new double[NYEARS][NRATE];
        //先获得第一行本金行
        for (int j=0;j<balances[0].length;j++) {
            balances[0][j] = b;
        }
        //获取剩下剩余行的本金
        for (int i = 1;i<balances.length;i++) {
            for (int j =0;j<balances[i].length;j++) {
                //获取上一年本金
                double oldBalance = balances[i-1][j];
                //计算利息
                double interest = oldBalance * interestRate[j];
                //计算当年的本金(本金加利息）
                balances[i][j] = oldBalance + interest;
            }
        }

        //打印出利息行
        for (int j = 0;j <interestRate.length;j++)
            System.out.printf("%9.2f%%",100*interestRate[j]);

        //打印出本金表格
        System.out.println();

        for (double[] row : balances) {
            //打印行
            for (double col : row)
                System.out.printf("%10.2f",col);
            System.out.println();
        }
    }
}

