package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //setArray();
       // setChessboard();
        arryShake();
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }


    public static void setArray() {
        double[][] arryUser = new double[2][5];

        //  int n = (int) chekIntegerNumber();
        for (int i = 0; i < 5; i++) {
            arryUser[0][i] = (int) (Math.random() * 100);
            arryUser[1][i] = (int) (Math.random() * 100);
        }
        System.out.println("Изначальный двумерный массив " + Arrays.deepToString(arryUser));
        System.out.println("Введите число которое добавит к каждому значению массива:");
        double sumNumber = getInput().nextDouble();

        for (int i = 0; i < 5; i++) {
            arryUser[0][i] += sumNumber;
            arryUser[1][i] += sumNumber;
        }
        System.out.println("Новый двумерный массив " + Arrays.deepToString(arryUser));
        double arryOne = 0.0;
        double arryTwo = 0.0;
        for (int i = 0; i < 5; i++) {
            arryOne += arryUser[0][i];
            arryTwo += arryUser[1][i];
        }

        System.out.println("Сумма первого массива = " + arryOne + "\n" +
                "Сумма второго массива = " + arryTwo + "\n" +
                "Общая сумма = " + (arryOne + arryTwo));
    }
    public static void setChessboard(){
        String [][] chessboard = new String[8][8];
        for (int row = 0; row < chessboard.length; row++) {
            for (int col = 0;col < chessboard[row].length; col++) {
             if(row%2==0) {
                 chessboard[row][col] = getColor(col,"W","B");
             }else {
                 chessboard[row][col] =  getColor(col,"B","W");
             }
                System.out.print( (chessboard[row][col]+"\t"));
          }
            System.out.println();
        }
    }

    public static String getColor(int col,String even ,String noteven){
        if (col % 2 == 0) {
           return even;
        } else {
            return noteven;
        }
    }
    public static void arryShake(){
        int i=0;
        System.out.println("Введите количесво строк");
        int sumRow = getInput().nextInt();
        System.out.println("Введите количесво столбцов");
        int sumCol = getInput().nextInt();

        int [][] shake = new int[sumRow][sumCol];
        for (int row = 0; row < shake.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < shake[row].length; col++) {
                    shake[row][col] = i++;
                }
            } else {
                for (int col = shake[row].length - 1; col >= 0; col--) {
                    shake[row][col] = i++;
                }
            }
        }

        for (int row = 0; row < shake.length; row++) {
            for (int col = 0; col < shake[row].length; col++) {
                System.out.print(shake[row][col] + "\t");
            }
            System.out.println();
        }
    }
}