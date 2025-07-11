import java.time.*;

public class Employeetest {
    public static void main(String[] args) {
        //使用3个雇员对象填充数组
        Employee[] numlist = new Employee[3];
        numlist[0] = new Employee("喜洋洋",1000.36,2016,6,12);
        numlist[1] = new Employee("章鱼哥",1200.36,2025,3,12);
        numlist[3] = new Employee("还秒宝宝",12500.36,12,25);
        //为每一个人加薪5%
        for (Employee e:numlist) {
            e.raiseSalary(6.5);
        }
        //打印出每位雇员的个人信息
        for (Employee e:numlist) {
            System.out.println("姓名="+e.getName()+"," +
                    "薪水："+e.getSalary()+",入职时间："+e.getHireday());
        }
    }
}

class Employee
{
    //实例字段
    private String name;
    private double salary;
    private Localdate hireDay;

    //构造对象
    public Employee(String n , double s,int year,int month,int day)
    {
        name = n;
        salary = s;
        hireDay = Localdate.of(year,month,day)
    }

    //创建方法
    public String getName() {
        return name;
    }

    //更多方法……
    //获取薪资
    public double getSalary() {
        return salary;
    }
    //获取入职时间
    public Locadate getHireday() {
        return hireDay;
    }
    //加薪百分比
    public void raiseSalary(double n) {
        double raise = salary * n / 100;
        salary += raise;
    }
}