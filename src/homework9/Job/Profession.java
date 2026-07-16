package homework9.Job;

public interface Profession {
    void getProfession();

    default void getSalary(){
        System.out.println("Получить зарплату");
    }
}
