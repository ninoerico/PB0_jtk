public class Square extends Rectangle {
    // Konstruktor tanpa argumen
    public Square() {
        super(1.0, 1.0);  // Panggil konstruktor dari Rectangle
    }

    // Konstruktor dengan panjang sisi yang diberikan
    public Square(double side) {
        super(side, side);  // Panggil konstruktor Rectangle dengan nilai side
    }

    // Konstruktor dengan side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Panggil konstruktor Rectangle
    }

    // Setter untuk panjang sisi, yang juga akan mengubah width dan length
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override metode toString() dari superclass
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
