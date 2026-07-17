package homework9.Figures;

public class Rectangle extends Figure {
    private final double longSideX;
    private final double longSideY;

    public Rectangle(double lengSids1, double lengSids2) {
        this.longSideX = lengSids1;
        this.longSideY = lengSids2;
    }
    @Override
    public double getSquare() {
        return this.longSideX * this.longSideY;
    }
    @Override
    public double getPerimeter() {
        return (this.longSideX + this.longSideY) * 2;
    }
    @Override
    public String toString() {
        System.out.println("-".repeat(60));
        return "Для прямоугольника:"+
                "\n\tПлощадь = " + (double) Math.round(getSquare() * 10) / 10 +
                "\n\tПериметр = " + (double) Math.round(getPerimeter() * 10) / 10;
    }
}
