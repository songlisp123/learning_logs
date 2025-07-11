
import java.util.Objects;
public class Manager extends Employee {
    private double bonus;
    //调用超累的构造函数
    public Manager(String n,double s,int year,int month,int day) {
        super(n,s,year,month,day);
        bonus = 0;
    }
    //重载超累的方法
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    //设置奖金
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //重写超类objects的equals方法
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        var other = (Manager) otherObject;
        //通过检查奖金来检查是否是同一对象
        return this.bonus == other.bonus;
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(),bonus);
    }
    public String toString() {
        return super.toString()+"[bonus="+bonus+"]";
    }
}