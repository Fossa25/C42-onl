package homework8;

public class Tiger extends Animal {


    public Tiger(String species, String name, int years, int weight, String gender) {
        super(species, name, years, weight, gender);
    }

    @Override
    public void vois(){
        System.out.println("RRRR");
    }

    @Override
    public void eat(String food) {
        boolean found = false;
        for (String eatCarnivore :eatCarnivores) {
            if (eatCarnivore.equalsIgnoreCase(food)) {
                System.out.println("Тигр очень доволен " +food);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Тигр съедает вашу руку \n:(");
        }
    }


}
