public class ClassTest {
    public static void main(String[] args) {
        var zs = new Student("张三",12.56,1);
        var ls = new Sanhaoxuesheng("李四",12.65,2,50.00);
        System.out.println(zs.getSt_id()+" "+zs.getName()+" "+zs.getScore());
        System.out.println(ls.getSt_id()+" "+ls.getName()+" "+ls.getScore());
        ls.setRank(5);
        ls.setBonus(100.00);
        
        System.out.println(ls.getRank()+" " + ls.getBonus());
    }
}

class Student {
    //对象字段
    private String name;
    private double score;
    private int st_id;

    //构造器
    public Student(String n,double s,int i) {
        name = n;
        score = s;
        st_id = i;
    }

    public String getName() {
        return this.name;
    }
    public double getScore() {
        return this.score;
    }

    public int getSt_id() {
        return this.st_id;
    }
}

 public class Sanhaoxuesheng extends Student {
    //添加新的字段
    private int rank = 0;
    private double bonus ;
    //调用超累的构造器
    public Sanhaoxuesheng(String n,double s,int i,double b) {
        super(n,s,i);
        bonus = b;
    }
    public int getRank() {
        return  this.rank;
    }
    public double getBonus() {
        return this.bonus;
    }
    public void setBonus(double s) {
        this.bonus += s;
    }
    public void setRank(int r) {
        this.rank += r;
    }
}