public class ParamTest {
    public static void main(String[] args) {
        /**
         * 测试1：方法不能修改数字变量
         */
        System.out.println("测试三倍值！");
        double percent = 10;
        System.out.println("之前percent:"+percent);
        tripleValue(percent);
        System.out.println("之后percent:"+percent);
        /**
         * 测试2：方法能改变对象的状态
         */
        System.out.println("\n测试三倍的薪资");
        var harry = new Employee("张三",300.633);
        System.out.println("之前薪资"+harry.getSalary());
        tripleSalary(harry);
        System.out.println("之后薪资:"+harry.getSalary());

        /**
         * 测试三：方法不能改变对象的状态
         */

        System.out.print("\n测试交换");
        var a = new Employee("李四",1225.36);
        var b = new Employee("王五",1258.36);
        System.out.println("之前：a="+a.getName());
        System.out.println("之前：b="+b.getName());
        swap(a,b);
        System.out.println("之后：a="+a.getName());
        System.out.println("之后：b="+b.getName());
    }
}
//函数
public static void tripleValue(double x) {
    x = 3 * x;
    System.out.println("方法调用之后:x="+x);
}

public static void tripleSalary(Employee e) {
    e.raiseSalary(10);
    System.out.println("方法调用之后:薪资="+e.getSalary());
}

public static void swap(Employee a,Employee b) {
    Employee temp = a;
    a = b;
    b = temp;
    System.out.println("方法调用之后：a="+a.getName());
    System.out.println("方法调用之后：b="+b.getName());
}


class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n ,double s) {
        name = n;
        salary = s;
        id = advancedId();
    }

    //方法：
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public double raiseSalary(double percent) {
        double raise = this.salary * percent / 100;
        salary += raise;
    }
    public static int getNextId() {
        return nextId;
    }
    public static int advancedId() {
        int r = nextId;
        nextId++;
        return r;
    }
}