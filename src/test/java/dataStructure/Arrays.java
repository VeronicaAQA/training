package dataStructure;

public class Arrays {
    /* Задача 1: Массивы (Arrays)
Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
*/
    public static void main(String[] args) {
        int[] arrayFirst = {3, 2, 1, 3, 1, 12, 2};
        System.out.println(sumAllElements(arrayFirst));
    }

    public static int sumAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
