package homework15;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Animals {

   private static final ArrayList<String> allAnimals= new ArrayList<>(List.of("Кошка", "Тигр", "Орёл"));
    public static void setAnimal(String who){
        System.out.println("В нашем зоопарке такие животные - "+allAnimals);
        allAnimals.addFirst(who);
        System.out.println("Так, а теперь - " + allAnimals);

    }
    public static void deleteAnimal(){
       try {
           System.out.println("В нашем зоопарке такие животные - "+allAnimals);
           allAnimals.removeLast();
           System.out.println("Одного к сожалению не стало - " + allAnimals);
       }catch (NoSuchElementException e){
           System.out.println("Нам больше не кого убрать");
       }

    }
    @Override
    public String toString() {
        return String.valueOf(allAnimals);
    }
}
