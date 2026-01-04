package classAndOop.Student;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Student origin = new Student("test", UUID.randomUUID(), 2.3);
        Student student2 = origin.clone();
        System.out.println(student2.toString());
        System.out.println(origin);
    }
}
