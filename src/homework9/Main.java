package homework9;
import homework9.Figures.CalculateFigure;
import homework9.Figures.Figure;
import homework9.Job.Dialog;

public class Main {
    public static void main(String [] args){
        Dialog.getDialog();
        getCalculateArrayFire();
    }
    public static void getCalculateArrayFire(){
        CalculateFigure calculateFigure = new CalculateFigure();
        double sumPerimeter = 0;
        Figure[] arrayFigures = {
                calculateFigure.calculateCircle(5),
                calculateFigure.calculateRectangle(5,2),
                calculateFigure.calculateTriangle(4,6,8),
                calculateFigure.calculateRectangle(10,22),
                calculateFigure.calculateTriangle(10,14,6),
                calculateFigure.calculateCircle(1),
        };
        for (Figure figura:arrayFigures ){
            System.out.println(figura);
            sumPerimeter=figura.getPerimeter()+sumPerimeter;
        }
        System.out.println("-".repeat(50));
        System.out.println("Общая сумма периметров = " + sumPerimeter);
    }
}
