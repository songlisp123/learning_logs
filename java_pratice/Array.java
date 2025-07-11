import java.util.*;

public class Array {
    public static void main(String[] args) {
     double unmber = Math.sqrt(50);
     int unmber_1 = (int) unmber;
     //byte n = 168;
     System.out.println(unmber_1);
     System.out.println(unmber);
     int[] a = new int[100];
     for (int i = 0 ; i < 10 ; i++) {
           a[i] = i;
           System.out.println("当前a的元素为:" + a[i]);
       }
     //System.out.println(n);
     enum Size { SMALL , MEDIUM , LARGE , EXTRA_LARGE };
     Size s = Size.SMALL;
     Size o = null;
     System.out.println(s);
     //获取键盘输入
        Scanner in = new Scanner(System.in);
        //此函数使用条件运算符验证两个数的大小
        System.out.print("请输入您的第一个数字：");
        int c  = in.nextInt();
        System.out.print("请输入您的第二个数字：");
        int b = in.nextInt();
        /**
         * 使用条件运算符判断最小值
         */
        int m = c < b ? c : b ;
        System.out.println("当前的最小值为："+m);



    }
}