package homework6;

import java.util.Scanner;

public class Main {
    static CreditCard me = new CreditCard();
    static CreditCard wife = new CreditCard();
    static CreditCard children = new CreditCard();
    static double translation;
    public static void main(String[] args) {
        jobBank();

    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }


    public  static  void getInforBank(){

        me.cartNumber="777777";
        me.cartMoney=1000;
        wife.cartNumber="333333";
        wife.cartMoney=100;
        children.cartNumber="555555";
        children.cartMoney=50;

    }

    public static void jobBank(){
        getInforBank();
        do {
            System.out.println("-".repeat(70));
            System.out.println("Какое действие будет проводить?" +
                    "\n" + "1  - Получить информацию о кредитной карточке " +
                    "\n" + "2  - Перевести деньги с карты на карту"+
                    "\n" + "3  - Снять деньги" +
                    "\n" + "0  - Выйти из программы");

            System.out.println("Ожидаю номер задания");
            int chois = getInput().nextInt();
            System.out.println("-".repeat(70));
           if (chois==2 ||chois==3 ){
               System.out.println("Какую сумму?");
               translation = getInput().nextInt();
           }

            switch (chois){
                case 1 -> getAllinformCart();
                case 2 -> {
                    withdrawCart(translation);
                    if (me.translationOperation){
                    translationCartorCart(translation);
                    }
                }
                case 3 -> withdrawCart(translation);
                case 0 -> {return;}
                default ->  System.out.println("Введен не существующий вариант!");
            }

        } while (true);
    }
    public static void getAllinformCart(){

        System.out.println("Какое счет проверить?" +
                "\n" + "1  - Мой " +
                "\n" + "2  - Жены"+
                "\n" + "3  - Ребенка" );
        int chois = getInput().nextInt();
        System.out.println("-".repeat(70));
        switch (chois){
            case 1 ->  me.informCart(me.cartMoney);
            case 2 ->  wife.informCart(wife.cartMoney);
            case 3 ->  children.informCart(children.cartMoney);
            default ->  System.out.println("Введен не существующий вариант!");
        }
    }
    public static void withdrawCart(double translation ){

        System.out.println("C какого счёта снимем деньги?" +
                "\n" + "1  - Мой " +
                "\n" + "2  - Жены"+
                "\n" + "3  - Ребенка" );
        int chois = getInput().nextInt();

        System.out.println("-".repeat(70));
        switch (chois){
            case 1 -> me.cartMoney= me.withdrawMoney(translation);
            case 2 -> wife.cartMoney= wife.withdrawMoney(translation);
            case 3 -> children.cartMoney= children.withdrawMoney(translation);
            default ->  System.out.println("Введен не существующий вариант!");
        }
    }

    public static void translationCartorCart(double translation){

        System.out.println("На какой счёта переводим деньги?" +
                "\n" + "1  - Мой " +
                "\n" + "2  - Жены"+
                "\n" + "3  - Ребенка" );
        int chois = getInput().nextInt();
        System.out.println("-".repeat(70));
        switch (chois){
            case 1 -> me.cartMoney= me.accrueMony(translation);
            case 2 -> wife.cartMoney= wife.accrueMony(translation);
            case 3 -> children.cartMoney= children.accrueMony(translation);
            default ->  System.out.println("Введен не существующий вариант!");
        }
    }

}