package classAndOop.inheritance;

public class Manager extends Employee {

    public int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void printInfo(){
        System.out.println(name + ": зарплата " + salary + ", бонус " + bonus);
    }
}
