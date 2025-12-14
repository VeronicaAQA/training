package classAndOop.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Иван", 30000);
        Manager mgr = new Manager("Ольга", 50000, 10000);
        emp.printInfo();
        mgr.printInfo();
    }
}
