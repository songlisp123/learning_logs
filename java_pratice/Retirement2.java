import java.util.*;

/**
 * 这是一个退休的另一个版本，使用的是do/while版本
 */

public class Retirement2 {
    public static void main(String[] args) {
        //获取键盘输入
        Scanner in = new Scanner(System.in);
        System.out.print("你想每年存多少钱？");
        double payment = in.nextDouble();
        System.out.print("已知的利率为：");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;

        //我不知道这个是什么意思
        String input;

        /**
         * 判断条件，当你不想退休的时候，余额 = 本金 + 利率
         */
        do {
            balance += payment;
            double lv = balance * interestRate / 100;
            balance += lv;
            years++;
            System.out.println("你在第"+years+"年的存款为:"+balance+"元！");
            //询问是否退休
            System.out.print("你是否想退休？->提示：输入(Y或N)");
            input = in.next();
        }
        while (input.equalsIgnoreCase("n")); {
            System.out.println("你在第"+years+"年退休"+"存款为："+balance+"元！");
        }

    }
}