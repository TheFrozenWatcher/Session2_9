package Exercise.Ex2;

public class Test {
    public static void main(String[] args) {
        // Tạo một mảng chứa các hình
        Shape [] shapes = new Shape[5]; // Chọn số lượng hình tùy ý

        // Khởi tạo mảng với các hình ngẫu nhiên (Square, Rectangle, Circle)
        shapes[0] = new Square(4.0, "blue", true);
        shapes[1] = new Rectangle(3.0, 5.0, "red", false);
        shapes[2] = new Circle(2.0, "green", true);
        shapes[3] = new Square(2.5, "yellow", false);
        shapes[4] = new Circle(3.5, "orange", true);

        // In diện tích
        System.out.println("Diện tích của hình là:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }


    }
}
