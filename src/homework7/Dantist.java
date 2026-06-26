package homework7;

public class Dantist extends Doktor {
    public Dantist(String surName, String profession) {
        super(surName, profession);
    }

    @Override
    public String getTreatment() {
        return " - Будем вырывать!";
    }
}
