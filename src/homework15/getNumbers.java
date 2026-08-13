package homework15;
import java.util.TreeSet;

public class getNumbers extends SetStringUser {
    public static void getNumbersUser(){
        System.out.println(YELLOW+"Введите цельные числа:"+RESET);
        TreeSet<Integer> linkedHashSet =new  TreeSet<>();
      try {
          for (String set:getInput().split(",")) {
              int number = Integer.parseInt(set);
              linkedHashSet.add(number);
          }
          System.out.println(linkedHashSet);
      }catch (NumberFormatException e){
          System.out.println(RED+BOLT+"Вы ввели не цельное число!"+RESET);
      }
    }
}

