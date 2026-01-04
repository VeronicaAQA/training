package classAndOop.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Овчарка", 3);
        Animal animal = new Animal("Кот", 2);
        dog.makeSound();
        dog.fetch();
        animal.makeSound();
    }
}
