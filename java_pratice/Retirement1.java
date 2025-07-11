//第三章练习：退休问题 whle循环

import java.util.*;
public class Retirement1 {
    public static void main(String[] args) {
        //读取输入
        Scanner in = new Scanner(System.in);
        System.out.print("你想要多少钱就退休？");
        double goal = in.nextDouble();
        System.out.print("你想要每个月存多少钱？");
        double payment = in.nextDouble();
        System.out.print("利率是：");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;

        //更新用户的资金当资金小于预期
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;

            //打印出当前一年的余额
            System.out.println("你可以在第"+years+"年存款,"+balance+"元！");
        }
        System.out.println("预计你可以在第"+years+"年退休！");

    }
}