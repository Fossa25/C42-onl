package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setArray();
    }
    
    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static double chekIntegerNumber() {
        double checkNumber;
        do {
            System.out.println("Введите цельное положительное число для определения размера массива:");
            checkNumber = getInput().nextDouble();
            if ((checkNumber % 1 == 0) && checkNumber > 0) {
                return checkNumber;
            } else {
                if (checkNumber <= 0 && !(checkNumber % 1 == 0)) {
                    System.out.println("Введено отрицательное не цельное число!");
                } else if (!(checkNumber % 1 == 0)) {
                    System.out.println("Введено не цельное число!");
                } else {
                    System.out.println("Введено отрицательное число!");
                }
            }
        } while (true);
    }

    public static void setArray() {
        int n = (int) chekIntegerNumber();
        int[] arryUser = new int[n];
        System.out.println("Как будем заполнять массив?" + "\n" + "1 Вариант - Случайный набор цифр." +
                "\n" + "2 Вариант - Вручную сами.");
        int chois;
        do {
            System.out.println("Введите цифру варианта -  1 или 2:");
            chois = getInput().nextInt();
            if ((chois == 1)) {
                for (int i = 0; i < n; i++) {
                    arryUser[i] = (int) (Math.random() * 100);
                }
                break;
            } else if ((chois == 2)) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Введите для индекса " + i + " значение:");
                    arryUser[i] = getInput().nextInt();
                }
                break;

            } else {
                System.out.println("Введен не существующий вариант!");
            }
        } while (true);

        do {
            System.out.println("-".repeat(70));
        System.out.println("Создан массив - "+Arrays.toString(arryUser));
        System.out.println("Что будем делать с  массивом?" + "\n" + "1  - Запустить массив в обратную сторону" +
                "\n" + "2  - Найти максимально и минимальное значение и их индексы"+
                "\n" + "3  - Найти и вывести количество нулевых элементов" +
                "\n" + "4  - Поменять местами элементы первый и последний, второй и предпоследний"+
                "\n" + "5  - Проверить, является ли массив возрастающей последовательностью"+
                "\n" + "0  - Выйти из программы");

            System.out.println("Введите цифру работы с массиов");
            chois = getInput().nextInt();
           switch (chois){
               case 1 -> reverseArray(arryUser);
               case 2 -> getMaxandMinNumberArray(arryUser);
               case 3 -> sumZero(arryUser);
               case 4 -> reverseArray2(arryUser);
               case 5 -> getOrder(arryUser);
               case 0 -> {
                   return;
               }
               default ->  System.out.println("Введен не существующий вариант!");
           }

        } while (true);

    }

    public static void reverseArray(int[] arryUser) {
        int n = arryUser.length;
        int[] newarryUser = new int[n];
        for (int i = 0; i < n; i++) {
            int x = n - i - 1;
            newarryUser[i] = arryUser[x];
        }
        System.out.println(Arrays.toString(newarryUser));
    }

    public static void getMaxandMinNumberArray(int[] arryUser) {
        int n = arryUser.length;
        int minNumber = 1000;
        int maxNumber = 0;
        int indexMinNumber = 0;
        int indexMaxNumber = 0;
        for (int i = 0; i < n; i++) {
            if (arryUser[i] < minNumber) {
                minNumber = arryUser[i];
                indexMinNumber = i;
            }
            if (arryUser[i] > maxNumber) {
                maxNumber = arryUser[i];
                indexMaxNumber = i;
            }
        }
        System.out.println("Минимальное значение в массиве = " + minNumber + "\n" + "его индекс = " + indexMinNumber);
        System.out.println("Максимальное значение в массиве = " + maxNumber + "\n" + "его индекс = " + indexMaxNumber);
    }

    public static void sumZero(int[] arryUser) {
        int n = arryUser.length;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arryUser[i] == 0) {
                countZero += 1;
            }
        }
        if (countZero == 0){
            System.out.println("В массиве нет нулевых элементов.");
        }else {
        System.out.println("Сумма нулевых элементов = "+ countZero);
        }
    }

    public static void reverseArray2(int[] arryUser) {

        int n = arryUser.length;
        int[] newarryUser = new int[n];

        for (int i = 0; i < n; i++) {
            int end = n - 1;
            int onetoend = n - 2;

            if(i==0){
                newarryUser[i] = arryUser[end];
            }else if(i==1){
                newarryUser[i] = arryUser[onetoend];
            } else if(i==onetoend){
            newarryUser[onetoend]=arryUser[end-i];
            } else if(i==end){
                newarryUser[end]=arryUser[end-i];
            } else{
                newarryUser[i] = arryUser[i];
            }
        }
        System.out.println(Arrays.toString(newarryUser));
    }
    public static void getOrder(int[] arryUser) {
        int n = arryUser.length;
        int x=arryUser[0];

        for (int i = 0; i < n; i++) {

            if (arryUser[i] < x) {
                System.out.println("Массив не является последовательным");
                return;
            }
        }
        System.out.println("Массив  является последовательным");
    }
}






//Для всех задач исходные условия следующие: пользователь с клавиатурой вводит размер
//массива (просто подразумевает число). После того, как задан размер массива, заполните его
//одним из двух способов: с помощью Math.random(), или каждый элемент массива вводится
//вручную. Попробовать оба партнера. После увеличения массива
//данные, решить для него следующую задачу:
//мир 1:
//Пройдите по массиву, выведите все элементы в прямом и обратном порядке.
//мир 2:

//найти min -максимальное количество элементов и вывод в
//Задача 3:
//Найти индексы минимального и максимального элементов и вывести в консоль.
//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет.
//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний
//Задача 6:
//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).
//Задача *:
//Имеется массив из неотрицательных чисел(любой). Представьте что массив
//представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//содержит нуля в начале, кроме самого числа 0.
//Пример:
//Input: [1,4,0,5,6,3]
//Output: [1,4,0,5,6,4]
//Input: [9,9,9]
//Output: [1,0,0,0]
