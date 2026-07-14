package homework8;

public class Rabbit extends Animal {

    public Rabbit(String species, String name, int years, int weight, String gender) {
        super(species, name, years, weight, gender);
    }

    @Override
    public void vois(){
        System.out.println("Frfrfr");
    }

    @Override
    public void eat(String food) {
        boolean found = false;
        for (String eatHerbivore : eatHerbivores) {
            if (eatHerbivore.equalsIgnoreCase(food)) {
                System.out.println("Кролик очень доволен " + food);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Кролик делает фырфырфыр и убегает от вас \n:(");
        }
    }
}
