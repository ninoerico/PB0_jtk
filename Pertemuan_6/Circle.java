public class Circle extends Shape {
    // Variabel instance radius
    private double radius;

    // Konstruktor tanpa argumen (no-arg)
    public Circle() {
        this.radius = 1.0;
    }

    // Konstruktor dengan radius yang diberikan
    public Circle(double radius) {
        this.radius = radius;
    }

    // Konstruktor dengan radius, color, dan filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);  // Panggil konstruktor superclass
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode untuk menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
