package dataStructure;

public class Strings {
    /*
    Задача 2: Строки (Strings)
Создать функцию, которая принимает строку и возвращает её в обратном порядке.
     */
    public static void main(String[] args) {
        System.out.println(swapString("tets"));
        System.out.println(swapString1("tets"));
    }

    public static String swapString(String test) {
        StringBuilder result = new StringBuilder();

        for (int i = test.length() - 1; i >= 0; i--) {
            char z = test.charAt(i);
            result.append(z);
        }
        return result.toString();
    }

    public static String swapString1(String test) {

        return new StringBuilder(test).reverse().toString();

    }
}
