package homework7;

public class Doktor {
    private String surName;
    private String profession;
    private String dayWeekadmission;
    private String receptiontime;

    public Doktor(String surName, String profession) {
        this.surName = surName;
        this.profession = profession;
    }
    public Doktor(String surName, String profession, String dayWeekadmission, String receptiontime) {
        this.surName = surName;
        this.profession = profession;
        this.dayWeekadmission = dayWeekadmission;
        this.receptiontime = receptiontime;
    }


    public String getTreatment(){
      return "Я не знаю как лечить, сейчас загуглю.";
    }

    public void setDayWeekadmission(String dayWeekadmission) {
        this.dayWeekadmission = dayWeekadmission;
    }

    public void setReceptiontime(String receptiontime) {
        this.receptiontime = receptiontime;
    }

    public String getSurName() {
        return surName;
    }

    public String getreceptiontime() {
        return receptiontime;
    }

    @Override
    public String toString() {
        return (" - Вам назначен: " +  this.profession+"\n" +
                "\tФамилия врача: " +   this.surName +"\n"+
                "\tДата приема - " +  this.dayWeekadmission +"\n" +
                "\tВремя - "+  this.receptiontime  );

    }


}
