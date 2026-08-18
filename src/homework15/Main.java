package homework15;
import java.util.ArrayList;
import java.util.List;

public class Main extends SetStringUser {
    public static void main(String[] args) {
       // getNumbers.getNumbersUser();
       // goZoo();
        getStudentsList();
    }
    public static void goZoo(){
        do {
            System.out.println("-".repeat(70));
            System.out.println(GREEN+"Добрый день, приветствую вас в зоопарке! "+
                    "\tБудем добавлять животных или убирать ? " + BLUE+
                    "\n\t" + "1  - Добавить " +
                    "\n\t" + "2  - Убрать "+
                    "\n\t" + "0  - Уйти из зоопарка"+RESET);
            System.out.println("-".repeat(70));
            switch (getInt()) {
                case 1 -> {
                    System.out.println("Кого к нам привезли?");
                    Animals.setAnimal(getInput());
                }
                case 2 ->{

                    Animals.deleteAnimal();
                }
                case 0 -> {return;}
                default -> {
                    System.out.println(RED+"Зоопарке можно только добавить или убрать)"+ RESET);
                    System.out.println("-".repeat(70));
                }
            }
        }while (true);
    }
    public static void getStudentsList(){
        List<Students> studentsArrayList= new ArrayList<>(List.of(
                new Students("Ivan","RPM",2,5,4,4),
                new Students("Asa","PRM",3,5,3,3),
                new Students("Egor","RPM",5,3,3,2),
                new Students("Natasha","RPM",2,2,2,4),
                new Students("Alex","PRM",3,2,3,3)
        ));
        System.out.println("Какой курс будем искать?");
        Students.printStudents(studentsArrayList,SetStringUser.getInt());
        studentsArrayList= Students.deleteStudents(studentsArrayList);
        System.out.println("Какой курс будем искать?");
        Students.printStudents(studentsArrayList,SetStringUser.getInt());
    }
}
