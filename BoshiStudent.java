import manange.StudentManager;
import manange.TeacherManager;

public class BoshiStudent implements TeacherManager, StudentManager {
    private String name;
    private String sex;
    private int age;
    private double fee;//Ñ§·Ñ
    private double salary;//Ð½Ë®

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double queryFee() {
        return this.getFee()*2;
    }

    @Override
    public void payFee() {

    }

    @Override
    public void paySalary() {

    }

    @Override
    public double querySalary() {
        return this.getSalary()*12;
    }

}
