package Exercise.Ex1;

public class Circle extends Shape implements Resizeable {
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

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2.0 * this.radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= 1 + percent / 100;
    }

}

