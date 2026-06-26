package homework7;



import java.util.Scanner;

public class Main {
    static Doktor surgeon = new Surgeon("Пупков В.Д.","Хирург");
    static Doktor dantist = new Dantist("Шишкин Р.И.","Дантист");
    static Patient Valera = new Patient();
    static Doktor therapist = new Therapist("Лабанов С.С.","Терапевт");
    static String time;
    public static void main(String[] args) {
        getHospital();

    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void getHospital(){
            System.out.println("-".repeat(70));
            System.out.println(" - Добрый день, что именно у вас болит?" +
                    "\n" + "\tЗуб или сердце, или что то другое?");

            System.out.println(" - Добрый день, Я пришёл с ..."+
                    "\n (А может сбежать) - легкие мысли пронеслись у меня.");
            String chois = getInput().nextLine().trim().toLowerCase();;
            System.out.println("-".repeat(70));
            int codTreatment = switch (chois) {
                case "зуб" -> 2;
                case "сердце" -> 1;
                case "сбежать" -> 0;
                default -> 3;
            };
            if (codTreatment==0) {
                System.out.println("- ЗА БАХИЛЫ ЗАПЛАТИ!!!");
                return;}
            System.out.println(" - Ваш план лечение № " + codTreatment + ". Назначаю Вам - " +
                    ((Therapist)therapist).dialogTreatment(codTreatment));
            System.out.println(" - В какой день подойдете ?");
            String day = getInput().nextLine();
            System.out.println("-".repeat(70));
            switch (codTreatment){
                case 1 -> {
                    surgeon.setDayWeekadmission(day);
                    surgeon.setReceptiontime( randomTime());
                    System.out.println(surgeon);
                    Valera.setSurName(surgeon.getSurName());
                    Valera.setTreatment( surgeon.getTreatment());
                }
                case 2 -> {
                    dantist.setDayWeekadmission(day);
                    dantist.setReceptiontime( randomTime());
                    System.out.println(dantist);
                    Valera.setSurName(dantist.getSurName());
                    Valera.setTreatment( dantist.getTreatment());
                }
                case 3 -> {
                    therapist.setDayWeekadmission(day);
                    therapist.setReceptiontime( randomTime());
                    System.out.println(therapist);
                    Valera.setSurName(therapist.getSurName());
                    Valera.setTreatment(therapist.getTreatment());
                }
                case 0 -> {return;}
            }
            System.out.println("-".repeat(70));
            System.out.println(Valera.getTreatmentPlan());
    }

    public static String randomTime(){
        int t =(int) ((Math.random()*10)+7);
        return t + ":00";
    }
}