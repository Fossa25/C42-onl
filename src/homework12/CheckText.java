package homework12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckText extends SetStringUser {

    public static void setText() {
        String sample = "О привет можешь проверить мои документы они нам подходят ? 1458-5-74 , пока помню свой номер " +
                "+(58)541258 , а точно номер 2341-1341-11 , кстати я поменял почту dat45@mail.r , вот еще был номер" +
                " 2545-5555-88 , а не я не правильно написал майл dat45@mail.ru к нему номер телефона был +(902)568955" +
                " или был такая почта archil777@gmail.com и точно был номер к нему +(33)777777 , ня пока! ";
        System.out.println(YELLOW + "Введите строчку:  " + RESET);
         do {
             System.out.println("-".repeat(70));
             System.out.println(GREEN+"Добрый день, приветствую вас в программе по поиску " +
                                      "почты,телефона и номера документа!\n" +
                                      "\tБудем проверять шаблон или сами напишете текст ? " + BLUE+
                                      "\n\t" + "1  - Давай шаблон " +
                                      "\n\t" + "2  - Хочу сам "+
                                      "\n\t" + "0  - Уйти из программы"+RESET);
             System.out.println("-".repeat(70));
             switch (getInt()) {
                 case 1 -> {
                     System.out.println(YELLOW + "Вот какой текст будем проверять:\n  " + RESET + sample);
                     checkText(sample.split(" "));
                 }
                 case 2 ->{
                     System.out.println(YELLOW + "Введите строчку:" + RESET);
                     checkText(getInput().split(" "));
                 }
                 case 0 -> {return;}
                 default -> {
                     System.out.println(RED+"Программа создана в РФ по этому либо 1 , либо 2 ."+ RESET);
                     System.out.println("-".repeat(70));
                 }
             }
         }while (true);
    }
    public static void checkText(String[] arryString) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Pattern pattern1 = Pattern.compile("^\\+\\((\\d{2})\\)\\d{6}$");
        Pattern pattern2 = Pattern.compile("^(\\d{4})-(\\d{4})-(\\d{2})$");
        for (String s : arryString) {
            Matcher matcher = pattern.matcher(s);
            Matcher matcher2 = pattern1.matcher(s);
            Matcher matcher3 = pattern2.matcher(s);
            if(matcher.find()){
                System.out.println("-".repeat(40));
                System.out.println(BOLT + "email: "+BLUE + s + RESET );
            }
            if(matcher2.find()){
                System.out.println("-".repeat(40));
                System.out.println(BOLT + "phone: "+GREEN + s + RESET );
            }
            if(matcher3.find()){
                System.out.println("-".repeat(40));
                System.out.println(BOLT + "document nomer: "+RED + s + RESET );

            }
        }
    }
}