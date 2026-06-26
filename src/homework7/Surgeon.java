package homework7;

public class Surgeon extends Doktor {
    public Surgeon(String surName, String profession) {
        super(surName, profession);
    }

    @Override
    public String getTreatment() {
        return " - Будем оперировать!";
    }
}
