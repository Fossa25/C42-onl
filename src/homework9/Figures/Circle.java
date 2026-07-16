package homework9.Figures;

public class Circle extends Figura {
   private final double radius;
    private final double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return  (this.radius*this.radius)*this.pi;
    }

    @Override
    public double getPerimeter() {
        return this.pi*this.radius*2;
    }

    @Override
    public String toString() {
        System.out.println("-".repeat(60));
        return "Для круга:"+
                "\n\tПлощадь = " +(double) Math.round(getSquare()*10)/10 +
                "\n\tПериметр = " + (double) Math.round(getPerimeter()*10)/10;
    }
}
