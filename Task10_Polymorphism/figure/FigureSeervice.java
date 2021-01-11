package Task10_Polymorphism.figure;
/*В примере классы все в майне, так решил сделать учитель*/


public class FigureSeervice {
    static double totalArea = 0.0;
    static double totalPerimeter = 0.0;

    public static void main(String[] args) {

        Color red = new Color("Красный");
        Figure figure = new Circle(red, 1, new Point(0, 0));
        addfigure(figure);

        Figure figure12 = new Rectangle(red, 2, 5);

        addfigure(figure12);

        red = new Color("синий");
        figure = new Rectangle(red, 2, 5);
        addfigure(figure);

    }

    private static void addfigure(Figure figure) {
        totalArea += figure.getArea();
        totalPerimeter += figure.getPerimeter();
        System.out.println();
        System.out.println(figure);
        System.out.format("Area=%.2f perimeter=%.2f", totalArea, totalPerimeter);


    }
}

class Point implements Scalable {
    private double a;
    private double y;

    public Point(double a, double y) {
        this.a = a;
        this.y = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void scale(int factor) {
        a = a * factor;
        y = y * factor;
    }
}

class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}


class Circle extends Figure {
    private double radius;
    private Point center;

    public Circle(Color color, double radus, Point center) {
        super(color);
        this.radius = radus;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("%s круг радиуса %.2f ", this.getColor().getName(), radius);
    }
}

class Rectangle extends Figure {
    private double sideA, sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideB * sideB);
    }

    @Override
    public String toString() {
        return String.format("%s прямоугольник %.2f на %.2f ", this.getColor().getName(), sideA, sideB);
    }

    class Trisngle extends Figure implements Scalable {
        private Point a, b, c;

        public Trisngle(Color color, Point a, Point b, Point c) {
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public void scale(int factor) {
            a.scale(factor);
            b.scale(factor);
            c.scale(factor);
        }

        @Override
        public double getArea() {
            return 0;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }
    }
}

interface Scalable {

    void scale(int factor);
}