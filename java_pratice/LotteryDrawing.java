import java.util.*;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("这是一个抽取彩票的小程序！");
        String s = """
                你将遵守以下规则：
                1：你将随机抽取六个数字；
                2：你将计算最终获奖概率；
                """ ;
        System.out.println(s);
        System.out.print("现在让我们开始？");
        System.out.print("你想要挑选什么数字？");
        int k = in.nextInt();
        System.out.print("抽奖号码最大数字是多少？");
        int n = in.nextInt();
        //将一百以内的数字填充到数组内
        int[] numbers = new int[n];
        for (int i=0;i<n;i++) numbers[i] = i;
        //随机抽取k个号码并将其放入第二个数组
        int[] results = new int[k];
        //抽奖逻辑
        for (int i=0;i<results.length;i++) {
            //随机获取一个从o到n-1的索引
            int r = (int) (Math.random()*n);
            results[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
       //对抽奖号码排序
       Arrays.sort(results);
       System.out.println("你的抽奖号码如下：祝您好运！");
       for (int r : results)
           System.out.println(r);
    }
}