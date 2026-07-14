package homework8;

public class Dog extends Animal {

    public Dog(String species, String name, int years, int weight, String gender) {
        super(species, name, years, weight, gender);
    }

    @Override
    public void vois(){

        System.out.println("Gaf");
    }

    @Override
    public void eat(String food) {
        System.out.println("Собака с радость съедает "+ food );
    }
}
