package classAndOop.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("test", 24, "man", "msk");
        Person person2 = new Person("test",24);
        System.out.println(person1.equals(person2));
    }
}
