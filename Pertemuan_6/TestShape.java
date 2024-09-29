public class TestShape {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2.toString());

        // Menguji kelas Circle
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(3.5, "yellow", false);
        System.out.println(circle2.toString());
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter());

        // Menguji kelas Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(2.0, 4.0, "purple", true);
        System.out.println(rectangle2.toString());
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.getPerimeter());

        // Menguji kelas Square
        Square square1 = new Square();
        System.out.println(square1.toString());

        Square square2 = new Square(5.0, "pink", false);
        System.out.println(square2.toString());
        System.out.println("Area of square2: " + square2.getArea());
        System.out.println("Perimeter of square2: " + square2.getPerimeter());
    }
}
