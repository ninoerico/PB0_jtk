public class Cylinder extends Circle {
    // Variabel instance private untuk tinggi
    private double height;

    // Konstruktor dengan warna, radius, dan tinggi default
    public Cylinder() {
        super();  // Memanggil konstruktor tanpa argumen dari kelas Circle
        this.height = 1.0;
    }

    // Konstruktor dengan radius dan warna default, tapi tinggi diberikan
    public Cylinder(double height) {
        super();  // Memanggil konstruktor tanpa argumen dari kelas Circle
        this.height = height;
    }

    // Konstruktor dengan warna default, tapi radius dan tinggi diberikan
    public Cylinder(double radius, double height) {
        super(radius);  // Memanggil konstruktor dari kelas Circle dengan radius
        this.height = height;
    }

    // Getter untuk tinggi
    public double getHeight() {
        return height;
    }

    // Override metode getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        double baseArea = super.getArea();  // Mendapatkan luas alas dari kelas Circle
        double surfaceArea = 2 * Math.PI * getRadius() * height + 2 * baseArea;
        return surfaceArea;
    }

    // Metode untuk menghitung volume silinder
    public double getVolume() {
        double baseArea = super.getArea();  // Menggunakan luas alas dari kelas Circle
        return baseArea * height;
    }

    // Override metode toString() untuk memberikan deskripsi lengkap objek Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}