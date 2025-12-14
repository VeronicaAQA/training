import java.util.Scanner;

import static java.lang.Integer.sum;

public class TaskBlock1 {

    public static void main(String[] args) {
        //Базовые операции в Java
        //sumAndDiff();
        //areaOfRectangle();
        //ostatok();
        //grad();
        //changeOfValueOfVariable();
        //oddOrEven();

        //Задачи на if и switch
        //calc();
        //timeOfYear();
        //ageVerification();
        //division();

        //Задачи на for
        //numbers();
        //sumOfNumbers();
        //multiplicationTable();
        //factorial();
        // evenNumb();

        //Задачи на вложенные циклы
        //multiplicationtable2();
        //rectangle();
        //pyramid();
        //findPrimeNum();
        chess();
    }

    //Базовые операции в Java
    public static void sumAndDiff() {
         /*
Задача 1: Сложение и вычитание чисел
Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
Пример ввода:
10
5
Пример вывода:
Сумма: 15
Разность: 5
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        int sum = sum(firstNumber, secondNumber);
        long difference = firstNumber - secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }

    public static void areaOfRectangle() {
        /*
    Задача 2: Площадь прямоугольника
Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
Пример:
Ширина: 4
Длина: 6
Площадь: 24
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ширина: ");
        int width = scanner.nextInt();
        System.out.print("Длина: ");
        int length = scanner.nextInt();
        if (width <= 0 || length <= 0) {
            System.out.println("Ширина/длина не может быть <= 0");
        } else {
            int area = width * length;
            System.out.println("Площадь: " + area);
        }
    }

    public static void ostatok() {
        /*
        Задача 3: Операции с остатком от деления
Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
Пример:
Введите первое число: 17
Введите второе число: 3
Результат деления: 5
Остаток: 2
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Результат деления: " + a / b);
        System.out.println("Остаток: " + a % b);

    }

    public static void grad() {
    /*
    Задача 4: Перевод градусов Цельсия в Фаренгейты
Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
Формула: F = C * 9/5 + 32.
Пример:

Введите температуру в Цельсиях: 25
Температура в Фаренгейтах: 77

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях: ");
        double c = scanner.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.println("Температура в Фаренгейтах: " + f);
    }

    public static void changeOfValueOfVariable() {
        /*
        Обмен значениями переменных
Поменяйте значения двух переменных местами без использования третьей переменной.
Пример:
До обмена: a = 5, b = 10
После обмена: a = 10, b = 5
         */
        int a = 5;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    //Задачи на if и switch
    public static void oddOrEven() {
      /*
Задача 1: Проверка чётности числа
Напишите программу, которая проверяет, является ли число чётным или нечётным.
Пример:
Введите число: 8
Результат: Чётное
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }

    public static void calc() {
        /*
        Задача 2: Калькулятор с использованием switch
Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
Пример:
Введите первое число: 7
Введите оператор: *
Введите второе число: 3
Результат: 21
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num = scanner.nextDouble();
        System.out.println("Введите оператор:");
        String operation = scanner.next();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        double res;

        switch (operation) {
            case ("+"):
                res = num + num2;
                System.out.println(res);
                break;
            case ("-"):
                res = num - num2;
                System.out.println(res);
                break;
            case ("*"):
                res = num * num2;
                System.out.println(res);
                break;
            case ("/"):
                if (num2 == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    res = num / num2;
                    System.out.println(res);
                }
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }

    public static void timeOfYear() {
        /*
        Задача 3:  Определение времени года
Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
Пример:
Введите номер месяца: 12
Результат: Зима
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Результат: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Результат: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Результат: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Результат: Осень");
                break;
            default:
                System.out.println("Число невалидно");
        }
    }

    public static void ageVerification() {
/*Задача 4: Проверка возраста
Напишите программу, которая определяет категорию человека по возрасту:
0-12: Ребёнок
13-17: Подросток
18-64: Взрослый
65+: Пенсионер.
Используйте if-else.
Пример:
Введите возраст: 30
Результат: Взрослый
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Ошибка");
        } else if (age <= 12) {
            System.out.println("Ребёнок");
        } else if (age <= 17) {
            System.out.println("Подросток");
        } else if (age <= 64) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }

    }

    public static void division() {
/*Задача 5: Проверка делимости
Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
Пример:
Введите число: 15
Результат: Делится на 3 и 5 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Результат: Делится на 3 и 5");
        } else {
            System.out.println("Результат: Число не делится на 3 и 5 одновременно");
        }
    }

    //Задачи на for
    public static void numbers() {
/*Задачи на for
Задача 1: Вывод чисел от 1 до 10
Напишите программу, которая выводит все числа от 1 до 10.
Пример вывода:
1 2 3 4 5 6 7 8 9 10
*/
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void sumOfNumbers() {
/*Задача 2: Сумма чисел от 1 до N
Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
Пример:
Введите N: 5
Сумма: 15 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма: " + sum);
    }

    public static void multiplicationTable() {
/* Задача 3: Таблица умножения для числа
Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
Пример:
Введите число: 3
3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int tab = 0;
        for (int i = 1; i <= 10; i++) {
            tab = x * i;
            System.out.println(x + " * " + i + " = " + tab);
        }
    }

    public static void factorial() {
/*Задача 4: Факториал числа
Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
Пример:
Введите N: 4
Факториал: 24*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int x = scanner.nextInt();
        int fact = 1;
        if (x == 0) {
            System.out.println("Факториал: 1");
        } else if (x < 0) {
            System.out.println("Факториал: не определен");
        } else {
            for (int i = 1; i <= x; i++) {
                fact = fact * i;
            }
            System.out.println("Факториал: " + fact);
        }
    }

    public static void evenNumb() {
/*Задача 5: Чётные числа до N
Пользователь вводит число N. Выведите все чётные числа от 1 до N.
Пример:
Введите N: 10
Чётные числа: 2 4 6 8 10 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Задачи на вложенные циклы
    public static void multiplicationtable2() {
/*Задача 1: Таблица умножения
Выведите таблицу умножения от 1 до 10 в формате:
1 x 1 = 1
1 x 2 = 2
...
10 x 10 = 100*/
        int y;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                y = i * j;
                System.out.println(i + " * " + j + " = " + y);
            }
            System.out.println();

        }
    }

    public static void rectangle() {
/*Задача 2: Прямоугольник из звёздочек
Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
Пример:
****
****
****
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый размер :");
        int m = scanner.nextInt();
        System.out.println("Введите второй размер :");
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid() {
/*Задача 3: Пирамида из звёздочек
Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
Пример:
   *
  ***
 *****
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void findPrimeNum() {
        /*Задача 4: Поиск простых чисел
Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.
Пример:
Введите N: 10
Простые числа: 2 3 5 7
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            System.out.println("Err");
        } else {
            for (int i = 2; i <= n; i++) {
                isPrime = true;
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void chess() {
/*Задача 5: Шахматная доска
Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..
Пример:
#.#.
.#.#
#.#.
.#.#
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
