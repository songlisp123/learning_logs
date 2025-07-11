public class Test {
    public static void main(String[] args) {
        /**
         * 初始化一个整数数组
         * 设置其长度为100，默认零填充
         */
        //int [] a = new int[100];
        //for (int i = 1 ; i<=10;i++) {
            //System.out.println(a[i]);
        //}
        /**
         * 使用另一种方法创建数组
         * 使用for each 循环
         */
        //int[] a = new int[100];
        //for (int i =0;i<100;i++) {
        //    a[i] = i;   //为每一个元素填充值
        //}
        ////使用另一种循环便利每个值
        //for (int i:a) {
        //    System.out.println(i);
        //}
        /**
         * 复制数组，学习引用和复制的区别
         */
        //int[] a = {3,5,5,6,2,94,3,4};
        //System.out.println("当前数组的长度为："+a.length);
        ////创建新的数组b，引用自a数组
        //int[] b = a;
        ////查看b数组的元素成员和长度
        //for (int i : b) {
        //    System.out.println(i);
        //}
        //System.out.println("当前b的长度为:"+b.length);
        //System.out.println(a == b);
        ////现在改变原数组a的值
        //a[2] = 10;
        //System.out.println(a[2]);
        ////创建新的数组c，复制a的数据到c数组中
        //int[] c = Arrays.copyOf(a,a.length);
        ////查看原来的C
        //System.out.println(c[2]);
        ////现在修改原数组a
        //a[2] = 12;
        ////打印出a数组和c数组的值
        //System.out.println(a[2]);
        //System.out.println(c[2]);
        if (args.length == 0 || args[0].equals("-h"))
            System.out.println("hello；");
        else if (args[0].equals("-g"))
            System.out.println("Goodby;");
        //打印出其他字符串数组
        for (int i=1;i<args.length;i++)
            System.out.println(args[i]);
    }
}