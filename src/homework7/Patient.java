package homework7;

public class Patient {
    private String surName;
    private String treatment;

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatmentPlan(){
        return ("Врач по фамилии : " +   this.surName +"\n"+
                "\tСказал вам\n" +   this.treatment   );
    }


}
