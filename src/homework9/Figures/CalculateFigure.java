package homework9.Figures;

public class CalculateFigure {
    public Figure calculateCircle(double x){
        return new Circle(x);
    }
    public Figure calculateRectangle(double x, double y){
        return new Rectangle(x,y);
    }
    public Figure calculateTriangle(double x, double y, double z){
        return new Triangle(x,y,z);
    }
}
