package homework9.Job;

public class Worker implements Profession{
    @Override
    public void getProfession() {
        System.out.println("Я простой рабочий!");
    }

    @Override
    public void getSalary() {
        System.out.println("Что такой зарплата?");
    }
}
