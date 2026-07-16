package homework9.Figures;

import homework9.Main;

public class Triangle extends Figura {
    private final double lengtSide1;
    private final double lengtSide2;
    private final double lengtSide3;


    public Triangle(double lengtSide1, double lengtSide2, double lengtSide3) {
        this.lengtSide1 = lengtSide1;
        this.lengtSide2 = lengtSide2;
        this.lengtSide3 = lengtSide3;
    }

    @Override
    public double getSquare() {
        double p2 = getPerimeter()/2;
        return Math.sqrt(p2*((p2-this.lengtSide1)*(p2-this.lengtSide2)*(p2-this.lengtSide3)));
    }

    @Override
    public double getPerimeter() {
        return this.lengtSide1+ this.lengtSide2+ this.lengtSide3;
    }
    @Override
    public String toString() {
        System.out.println("-".repeat(60));
        return "Для треугольника:"+
                "\n\tПлощадь = " +(double) Math.round(getSquare()*10)/10 +
                "\n\tПериметр = " + (double) Math.round(getPerimeter()*10)/10;
    }
}
