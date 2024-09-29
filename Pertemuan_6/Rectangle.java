public class Rectangle extends Shape {
    // Variabel instance untuk panjang dan lebar
    private double width;
    private double length;

    // Konstruktor tanpa argumen (no-arg)
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Konstruktor dengan lebar dan panjang yang diberikan
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Konstruktor dengan lebar, panjang, warna, dan filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);  // Panggil konstruktor superclass
        this.width = width;
        this.length = length;
    }

    // Getter untuk width
    public double getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk length
    public double getLength() {
        return length;
    }

    // Setter untuk length
    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Metode untuk menghitung keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
