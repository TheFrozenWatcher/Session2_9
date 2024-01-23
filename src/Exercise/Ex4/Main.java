package Exercise.Ex4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Blue", 4.0, 5.0);
        Shape circle = new Circle("Red", 3.0);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        rectangle.display();

        System.out.println("\nCircle Area: " + circle.getArea());
        circle.display();
    }
}
