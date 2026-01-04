package classAndOop.animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }
}
