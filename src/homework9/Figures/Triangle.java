package homework9.Figures;

public class Triangle extends Figure {
    private final double longSideX;
    private final double longSideY;
    private final double longSideZ;
    public Triangle(double longSideX, double longSideY, double longSideZ) {
        this.longSideX = longSideX;
        this.longSideY = longSideY;
        this.longSideZ = longSideZ;
    }
    @Override
    public double getSquare() {
        double p2 = getPerimeter() / 2;
        return Math.sqrt(p2 * ((p2-this.longSideX) * (p2-this.longSideY) * (p2-this.longSideZ)));
    }
    @Override
    public double getPerimeter() {
        return this.longSideX + this.longSideY + this.longSideZ;
    }
    @Override
    public String toString() {
        System.out.println("-".repeat(60));
        return "Для треугольника:"+
                "\n\tПлощадь = " + (double) Math.round(getSquare() * 10) / 10 +
                "\n\tПериметр = " + (double) Math.round(getPerimeter() * 10) / 10;
    }
}
