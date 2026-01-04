package classAndOop.Student;

import java.util.Objects;
import java.util.UUID;

public class Student {
    private String name;
    private UUID id;
    private double gpa;

    public Student(String name, UUID id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;

        return Objects.equals(id, ((Student) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //метод, возвращающий строку с информацией о студенте
    public String toString() {
        return ("Student{id=" + id + ", name=" + name + ", gpa=" + gpa + "}");
    }

    //копия объекта
    @Override
    public Student clone() {
        return new Student(name, id, gpa);
    }
}
