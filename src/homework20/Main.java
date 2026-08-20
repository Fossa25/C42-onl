package homework20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // MinAndMaxThread.startTread(getInputAsIntArray());
        ArraySorting.sortThread(getInputAsIntArray());
    }
    public static int[] getInputAsIntArray() {
        System.out.println("Введите цельные числа , используя пробел. Без запятых");
        String input = MinAndMaxThread.getInput();
        return Arrays.stream(input.split("\\s+"))
                                  .filter(s -> s.matches("-?\\d+"))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();
    }
}
