package homework18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber =new  ArrayList<>(List.of(1,50,74,50,12,348,18,86,50,418,11,33,9,12,348));
        System.out.println("Изначальный набор - " + listNumber);
        List<Integer> listNumberNotDouble = listNumber.stream()
                                                           .distinct()
                                                           .toList();
        System.out.println("Убраны дубликаты - " + listNumberNotDouble );

        List<Integer> listNumberEven = listNumberNotDouble.stream()
                                                          .filter(i->i%2==0)
                                                          .toList();
        System.out.println("Убраны не четные числа - " + listNumberEven );

        int sum = listNumberEven.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма оставшихся элементов: " + sum);
    }
}
/* Вот сокращенная версия без лишних коллекций

int sum = listNumber.stream()
                    .distinct()
                    .filter(i -> i % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

System.out.println("Сумма уникальных чётных элементов: " + sum);
 */