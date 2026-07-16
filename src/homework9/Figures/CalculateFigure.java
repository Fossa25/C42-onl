package homework9.Figures;

public class CalculateFigure {

    public Figura calculateCircle(double x1){
        return new Circle(x1);
    }
    public Figura calculateRectangle(double x1,double x2){
        return new Rectangle(x1,x2);
    }
    public Figura calculateTriangle(double x1,double x2,double x3){
        return new Triangle(x1,x2,x3);
    }

}
