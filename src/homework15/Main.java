package homework15;

public class Main extends SetStringUser {
    public static void main(String[] args) {
       // getNumbers.getNumbersUser();
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
}
