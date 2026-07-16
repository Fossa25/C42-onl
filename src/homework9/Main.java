package homework9;


import homework9.Figures.CalculateFigure;
import homework9.Figures.Figura;
import homework9.Job.Dialog;

public class Main {
    public static void main(String [] args){
        Dialog.getDialog();
        getCalculeteArryFigure();


    }

    public static void getCalculeteArryFigure(){
        CalculateFigure calculateFigure = new CalculateFigure();
        Figura [] arryFigures = {
                calculateFigure.calculateCircle(5),
                calculateFigure.calculateRectangle(5,2),
                calculateFigure.calculateTriangle(4,6,8),
                calculateFigure.calculateRectangle(10,22),
                calculateFigure.calculateTriangle(10,14,6),
                calculateFigure.calculateCircle(50),
        };
        for (Figura figura:arryFigures ){
            System.out.println(figura);
        }

    }
}
