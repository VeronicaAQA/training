package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    /*
    Задача 3: Списки (Lists)
Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
     */
    public static void main(String[] args) {
        odd();
    }

    public static void odd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список целых чисел в 1 строку");
        String allArray = scanner.nextLine();


        String[] splitString = allArray.split(" ");
        List<Integer> test = new ArrayList<>();
        int step;
        for (int i = 0; i <= splitString.length - 1; i++) {
            step = Integer.parseInt(splitString[i]);
            if (step % 2 != 0) {
                test.add(step);
            }
        }
        System.out.println(test);

    }

}
