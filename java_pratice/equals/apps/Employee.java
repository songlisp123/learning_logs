
import java.util.*;
import java.time.*;
import java.util.Objects;

//测试
public class Employee {
    //对象字段
    //类的字段
    private static int nextId = 1;
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    //构造函数
    public Employee(String n,double s,int year,int month,int day) {
        name = n;
        salary = s;
        id = advancedId();
        hireDay = LocalDate.of(year,month,day);
    }

    //方法,用来设置雇员的id值
    public int advancedId() {
        int r = nextId;
        nextId++;
        return r;
    }

    //方法：获取姓名
    public String getName() {
        return this.name;
    }

    //获取薪资
    public double getSalary() {
        return this.salary;
    }

    //获取雇员id
    public int getId() {
        return this.id;
    }

    //获取雇员日期
    public LocalDate getHireDay() { return this.hireDay;}

    //增加工资
    public void setSalary(double percent) {
        double raise = this.salary + percent / 100;
        //返回原本的工资
        this.salary += raise;
    }
    public boolean equals(Object otherObject) {
        //第一中情况：如果对象不相等，返回false;
        if (this == otherObject) return true;
        //第二种情况：当提供的显示参数otherObject为null时，返回false;
        if (otherObject == null) return false;
        //第三种情况：当两者不属于同一类时，返回fasle；
        if (this.getClass() != otherObject.getClass() ) return false;
        //当不满足以上所用情况的时候，我们可以得出结论：otherobject是employee实例
        var other = (Employee) otherObject;
        //测试两者的字段
        return Objects.equals(this.name,other.name) &&
                this.salary == other.salary &&
                Objects.equals(this.hireDay,other.hireDay);
    }
    //重写hash编码
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);
    }
    public String toString() {
        return this.getClass().getName() + "[name="+name+",salary="
                +salary+",hireDay="
                +hireDay+"]";
    }
    public int getNextId() {
        return this.nextId;
    }
}