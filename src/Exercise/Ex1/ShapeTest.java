package Exercise.Ex1;

public class ShapeTest {
    public static void main(String[] args) {
        // Tạo một mảng chứa các hình
        Resizeable[] shapes = new Resizeable[5];

        // Khởi tạo mảng với các hình ngẫu nhiên (Square, Rectangle, Circle)
        shapes[0] = new Square(4.0, "blue", true);
        shapes[1] = new Rectangle(3.0, 5.0, "red", false);
        shapes[2] = new Circle(2.0, "green", true);
        shapes[3] = new Square(2.5, "yellow", false);
        shapes[4] = new Circle(3.5, "orange", true);

        // In thông tin trước khi thay đổi kích thước
        System.out.println("Before resizing:");
        for (Resizeable shape : shapes) {
            System.out.println(shape);
        }

        // Thay đổi kích thước mỗi hình với tỉ lệ ngẫu nhiên từ 1 đến 100
        for (Resizeable shape : shapes) {
            double randomPercent = Math.random() * 100 + 1;
            shape.resize(randomPercent);
        }

        // In thông tin sau khi thay đổi kích thước
        System.out.println("\nAfter resizing:");
        for (Resizeable shape : shapes) {
            System.out.println(shape);
        }
    }
}
