public class Shape {
    // Variabel instance
    private String color;
    private boolean filled;

    // Konstruktor tanpa argumen (no-arg)
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Konstruktor dengan argumen
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk variabel color
    public String getColor() {
        return color;
    }

    // Setter untuk variabel color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk variabel filled (boolean), gunakan isFilled()
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk variabel filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString() untuk mendeskripsikan bentuk
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
