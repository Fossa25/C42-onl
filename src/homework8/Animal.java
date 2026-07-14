package homework8;

public class Animal extends Zoo {
    private final String species ;
    private final String name;
    private final int years;
    private final int weight;
    private final String gender;



    public Animal(String species, String name, int years, int weight, String gender) {
        this.species = species;
        this.name = name;
        this.years = years;
        this.weight = weight;
        this.gender = gender;
    }

    public void vois(){
        System.out.println("...");
    }
    public void eat(String food){
        System.out.println(food);
    }

    @Override
    public String toString() {
        return "Species: " + this.species+
                "\n\tName: " + this.name+
                "\n\tYears: " + this.years+
                "\n\tWeight: " + this.weight+
                "\n\tGender: " + this.gender;

    }
}
