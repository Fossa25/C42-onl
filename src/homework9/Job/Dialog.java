package homework9.Job;

public class Dialog {
    public static void getInformation(Profession p){
        System.out.println("-".repeat(60));
        System.out.println("Какая твоя должность?");
        p.getProfession();
        System.out.println("Сегодня день зарплаты)");
        p.getSalary();

    }

    public static void getDialog(){
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();
        getInformation(director);
        getInformation(accountant);
        getInformation(worker);

    }
}
