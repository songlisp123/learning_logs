import java.util.Scanner;


public class EqualsTest {
    public static void main(String[] args) {
        //暂时没有关系
        Scanner in = new Scanner(System.in);
        System.out.println("请选择您的雇员:");
        var name = in.nextLine();
        System.out.println("请选择您的经理：");
        var boss_name = in.nextLine();
        var zs = new Employee(name,12.56,2016,8,16);
        var zs_1 = zs;
        var zs_2 = new Employee(name,12.56,2016,8,16);
        var ls = new Employee("李四",2500.36,2018,8,25);
        var boss = new Manager(boss_name,30.6,2010,4,13);
        var boss_1 = new Manager(boss_name,30.6,2010,4,13);
        boss.setBonus(2500.00);
        //上面只是一个简单的测试，用来测试Employee类
        //和manage类初始化
        //接下来我们要测试hashcode和equals方法
        System.out.println("接下来是一个测试，用来测试employee类重写的equals方法");
        System.out.println();
        System.out.println("==============判断zs与zs_1是否相等=================");
        System.out.println(zs.toString());
        System.out.println(zs_1.toString());
        System.out.println("zs == zs_1--->"+(zs == zs_1));
        System.out.println("================================================");
        System.out.println();
        System.out.println("==============判断zs与zs_2是否相等=================");
        System.out.println(zs.toString());
        System.out.println(zs_2.toString());
        System.out.println("zs == zs_2---->"+(zs == zs_2));
        System.out.println("================================================");
        System.out.println();
        System.out.println("==============使用equals方法判断=================");
        System.out.println(zs.toString());
        System.out.println(zs_1.toString());
        System.out.println("zs.equals(zs_1)---->"+zs.equals(zs_1));
        System.out.println("================================================");
        System.out.println();
        System.out.println("================使用equals方法判断===============");
        System.out.println(zs.toString());
        System.out.println(zs_2.toString());
        System.out.println("zs.equals(zs_2)---->"+zs.equals(zs_1));
        System.out.println("================================================");
        System.out.println();
        System.out.println("================判断经理类的equals===============");
        System.out.println(boss.toString());
        System.out.println(boss_1.toString());
        System.out.println("boss.equals(boss_1)---->"+boss.equals(boss_1));
        System.out.println("================================================");
        System.out.println();
        System.out.println("================判断hashcode值===============");
        System.out.println(zs.toString());
        System.out.println(zs_1.toString());
        System.out.println(zs_2.toString());
        System.out.println("zs.hashcode()--->"+zs.hashCode());
        System.out.println("zs_1.hashcode()--->"+zs_1.hashCode());
        System.out.println("zs_2.hashcode()--->"+zs_2.hashCode());
        System.out.println("================================================");
        System.out.println();
        System.out.println("================判断hashcode值===============");
        System.out.println(boss.toString());
        System.out.println(boss_1.toString());
        System.out.println("boss.hashcode()--->"+boss.hashCode());
        System.out.println("boss_1.hashcode()--->"+boss_1.hashCode());
        System.out.println("================================================");

    }
}
