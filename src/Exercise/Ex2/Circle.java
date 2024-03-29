package Exercise.Ex2;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2.0 * this.radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.toString();
    }


}

