package homework7;

public class Therapist extends Doktor {
    public Therapist(String surName, String profession) {
        super(surName, profession);
    }
    public String dialogTreatment(int cod){
        return switch (cod) {
            case  1 -> "Хирург";
            case  2 -> "Дантист";
            case  3 -> "Терапевт";
            default -> getTreatment();
        };
    }

    @Override
    public String getTreatment() {
        return " - Прописываю Вам пилюльку от всего!";
    }


}