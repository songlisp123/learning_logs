public class StaticTest {
    public static void main(String[] args) {
        //创建一个雇员数组，长度为三
        var num = new Employee[3]; //
        num[0] = new  Employee("李四",2000.56);
        num[1] = new Employee("王五",1500.36);
        num[2] = new Employee("李六",5689.36);

        //打印出每个雇员的信息
        for (Employee e:num) {
            System.out.println("name=" + e.getName() + ",id=" +
                            e.getId() + ",salary="
                     + e.getSalary());
        }
        int n = Employee.getNextId();       //类的静态方法
        System.out.println("下一个有效值是："+n);
        System.out.println(num[0].nextId);
        System.out.println(num[0].name);
    }
}

class Employee {
    private static int nextId = 1;     //静态字段（属性），类属性
    private String name;
    private double salary;
    private int id;

    //构造函数
    public Employee(String n ,double s) {
        name = n;
        salary = s;
        id = advancedId();
    }

    //方法（对象的行为)
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public static int advancedId() {
        int r = nextId;
        nextId++;
        return r;
    }
    //静态方法
    public static int getNextId() {
        return nextId;
    }
    //单元测试
    public static void main(String[] args) {
        var e = new Employee("张三",50000.32);
        System.out.println(e.name+" "+e.salary);
    }
}