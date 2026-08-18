package homework15;

import java.util.ArrayList;
import java.util.List;

public class Students extends SetStringUser {
    private final String name;
    private final String group;
    private int well;
    private final int gradeRussia;
    private final int gradeEnglish;
    private final int gradeJava;
    public Students(String name, String group, int well, int gradeRussia, int gradeEnglish, int gradeJava) {
        this.name = name;
        this.group = group;
        this.well = well;
        this.gradeRussia = gradeRussia;
        this.gradeEnglish = gradeEnglish;
        this.gradeJava = gradeJava;
    }
    public static List<Students> deleteStudents( List<Students> studentsList){
        System.out.println("-".repeat(50));
        System.out.println(GREEN+"Все студенты  \n"+studentsList+RESET);
        System.out.println("-".repeat(50));
        List<Students> newList = new ArrayList<>();
        for (Students qrade : studentsList){
            if(((qrade.gradeEnglish+qrade.gradeRussia+qrade.gradeJava)/3)>=3){
               qrade.well = qrade.well + 1;
                newList.add(qrade);
                System.out.println(BLUE+"Студент " +qrade.name + " переводиться на новый курс "  +qrade.well+RESET);
            }
        }
        studentsList=newList;
        System.out.println("-".repeat(50));
        System.out.println(GREEN+"После отчисления : \n"+studentsList+RESET);
        System.out.println("-".repeat(50));
        return studentsList;
    }
    public static void printStudents(List<Students> studentsList, int course) {
        boolean found = false;
        for (Students student : studentsList) {
            if (student.well == course) {
                if (!found) {
                    System.out.println(YELLOW + "Список студентов обучающихся на " + course + " курсе:" + RESET);
                    found = true;
                }
                System.out.println(GREEN + student.name + RESET);
            }
        }
        if (!found) {
            System.out.println(RED + "На этом курсе никто не обучается" + RESET);
        }
    }
    @Override
    public String toString() {
        return YELLOW+"\n" +
                " name : " + name +
                ", group : " + group +
                ", well : " + well +
                ", gradeEnglish = " + gradeEnglish +
                ", gradeRussia = " + gradeRussia +
                ", gradeJava = " + gradeJava +
                RESET;
    }
}