package homework12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationSearch extends SetStringUser{
      public static void abbreviationSearch() {
          Pattern pattern = Pattern.compile("^[A-ZА-Я]{2,6}$");
          System.out.println(YELLOW + "Введите строчку:  "+ RESET);
          String [] arryString =getInput().split(" ");
          for (String s : arryString) {
              System.out.println("-".repeat(40));
              Matcher matcher = pattern.matcher(s);
              System.out.println(YELLOW + "Слово - " + s + RESET +
                      BLUE + "\nЯвляется аббвиатурой?\n" + RESET +
                      BOLT + (matcher.find() ? GREEN + "Да" : RED + "Нет") + RESET);
          }
      }
}
