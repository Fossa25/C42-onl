package homework8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Zoo zoo = new Zoo();
    do {
            System.out.println("-".repeat(70));
            System.out.println("Добрый день, в какую зону зоопарка пойдем?" +
                    "\n" + "1  - Зона с собакой " +
                    "\n" + "2  - Зона с тигром"+
                    "\n" + "3  - Зона с кроликом" +
                    "\n" + "0  - Уйти из зоопарка");

            System.out.println("Я пойду в ...(Напишите цифру зоны)");
            int chois= Zoo.getInput().nextInt();
            System.out.println("-".repeat(70));

            switch (chois){
                case 1 -> zoo.zonaDog();
                case 2 -> zoo.zonaTiger();
                case 3 -> zoo.zonaRabbit();
                case 0 -> {return;}
                default ->  System.out.println("Такой зоны в нашем зоопарке пока нет!");
            }
        } while (true);
    }

}