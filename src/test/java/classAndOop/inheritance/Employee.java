package classAndOop.inheritance;

public class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + ": зарплата " + salary);
    }
}
