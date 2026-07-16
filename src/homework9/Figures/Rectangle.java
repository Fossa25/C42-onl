package homework9.Figures;

public class Rectangle extends Figura {
   private final double lengSids1;
    private final double lengSids2;

    public Rectangle(double lengSids1, double lengSids2) {
        this.lengSids1 = lengSids1;
        this.lengSids2 = lengSids2;
    }

    @Override
    public double getSquare() {
        return this.lengSids1*this.lengSids2;
    }

    @Override
    public double getPerimeter() {
        return (this.lengSids1+this.lengSids2)*2;
    }
    @Override
    public String toString() {
        System.out.println("-".repeat(60));
        return "Для прямоугольника:"+
                "\n\tПлощадь = " +(double) Math.round(getSquare()*10)/10 +
                "\n\tПериметр = " + (double) Math.round(getPerimeter()*10)/10;
    }
}
