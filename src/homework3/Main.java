package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getEvennumber();
        //detectionTemperature();
       // getSquare1020();
       // getMultiplicationtable();
        getSumNumber();
    }






    public static void getEvennumber() {
        //Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выводить сообщение четное число или нет. Для определения четности числа
    //используйте операцию получения остатка от деления (операция выглядит так: '% 2').
         System.out.println("Задание №1"  );
     double checkNumber;

      do {
          System.out.println("Введите цельное число:" );
          checkNumber=getInput().nextDouble();
       if((checkNumber%1==0)){
           break;
       }else {
           System.out.println("Введено не цельное число!" );
       }
      }while (true);
        if (checkNumber%2==0){
            System.out.println("Число "+ (int)checkNumber + " - четное" );
        }else {
            System.out.println("Число "+ (int)checkNumber + " - не четное" );
        }
    }

    public static void detectionTemperature() {
        //Задача 2:
            //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
            //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
        System.out.println("Задание №2");
        System.out.println("Какая сегодня температура?" );
        int checkTemp;
        checkTemp=getInput().nextInt();
      if (checkTemp>-5){
          System.out.println("Today - Warm");
      }else if (checkTemp<=-5 && checkTemp>-20) {
          System.out.println("Today - Normal");
      } else {
          System.out.println("Today - Cold");
    }
    }
//Задача 3:
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void getSquare1020(){
        System.out.println("Задание №3");
        for(int i =10;i<=20;i++){
            System.out.println("Квадрат числа " + i +" = " + i*i);
        }
    }
    //Задача 4:
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void getMultiplicationtable(){
        System.out.println("Задание №4");
      int i = 0;
      int number = 7 ;
        while ( number < 98){
            i++;
            number=7*i;
            System.out.println("7 * " + i +" = " + number);
        }


    }

    public static void getSumNumber() {
        //Напишите программу, где пользователь вводит любое целое положительное число. А
        //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        //ввести некорректные данные.
        System.out.println("Задание №1");
        double checkNumber;

        do {
            System.out.println("Введите цельное положительное число:" );
            checkNumber=getInput().nextDouble();
            if((checkNumber%1==0) && checkNumber>0){
                break;
            }else {
               if(checkNumber<=0 && !(checkNumber%1==0)){
                   System.out.println("Введено отрицательное не цельное число!" );
               } else if (!(checkNumber%1==0)){
                   System.out.println("Введено не цельное число!" );
               }else {
                   System.out.println("Введено отрицательное число!" );
               }
            }
        }while (true);
        int n = 0;
            for(int i = 1; i<= checkNumber; i++){
                 n=n+i;
            }

        System.out.print("От 1 до "+(int)checkNumber+" сумма чисел = " + n  ) ;

    }

    public static Scanner getInput() {
         return new Scanner(System.in);
    }
}
