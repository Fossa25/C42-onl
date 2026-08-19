package homework17;

import homework15.SetStringUser;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllTask extends SetStringUser {

    public static void getYearUser(){
     boolean flag =false;
     while (!flag) {
         try {
             System.out.println(BLUE + "Введите дату рождения");
             int dateUser = getInt();
             System.out.println(BLUE + "Введите месяц рождения");
             int monthUser = getInt();
             System.out.println(BLUE + "Введите год рождения");
             int yearUser = getInt();
             LocalDate userYearFuture = LocalDate.of(yearUser, monthUser, dateUser).plusYears(100);
             System.out.println(userYearFuture);
             flag = true;
         } catch (InputMismatchException e) {
             System.out.println(RED + "Введите число!\n\t" + BOLT + "Начнем сначала!"+RESET);
         } catch (DateTimeException e){
             System.out.println(RED + "Введена не верная дата таких не существует!\n\t" +
                     BOLT + "Начнем сначала!"+RESET);
         }
      }
    }
    public static void getPositiveNumber (){
        Predicate<Integer> positiveNumber = x -> x > 0 ;
        int [] numbers = {5,10,-89,-5,1,0,-1,1,54,-78,-8,-1,45};
        System.out.println(BLUE+"Изначальный массив: "+Arrays.toString(numbers));
        for (int number : numbers) {
            if (positiveNumber.test(number)) {
                System.out.println(GREEN + "Положительное число : " + number + RESET);
            }
        }
    }
    public static void getFunctionDolor (){
      try {
        Function<String,Double> parse =  x -> (Double.parseDouble(x)/84.9);
        System.out.println(BLUE + "Сколько рублей будем обменивать ?");
        double result = parse.apply(getInput());
        System.out.printf(GREEN + "Да вот столько, Вы получите : " + "%.2f" + RESET,result);
        } catch (NumberFormatException e) {
            System.out.println(RED + "Введите число!\n\t Буквы не принимаются" +RESET);
        }
    }
    public static void getConsumerDolor (){
        Consumer<String> parse = x -> {
         try {
                double result = (Double.parseDouble(x) / 84.9);
                System.out.printf(GREEN + "Да вот столько, Вы получите : " + "%.2f" + RESET, result);
            } catch (NumberFormatException e) {
                System.out.println(RED + "Введите число!\n\t Буквы не принимаются" + RESET);
            }
        };
            System.out.println(BLUE + "Сколько рублей будем обменивать ?");
            parse.accept(getInput());
    }
    public static void getReversedInput() {
        System.out.println("Введите строчку");
        Supplier<String> supplier = () -> {
            return new StringBuilder(getInput()).reverse().toString();
        };
        System.out.println("Перевернутая строчка - \n" +supplier.get());
    }
}
