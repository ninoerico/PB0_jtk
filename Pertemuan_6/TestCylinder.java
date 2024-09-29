public class TestCylinder {
    public static void main(String[] args) {
        // Deklarasi dan pembuatan objek Cylinder baru dengan warna, radius, dan tinggi default
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: radius=" + c1.getRadius() +
                " height=" + c1.getHeight() +
                " surface area=" + c1.getArea() +
                " volume=" + c1.getVolume());

        // Deklarasi dan pembuatan objek Cylinder baru dengan tinggi yang ditentukan, tapi radius dan warna default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder 2: radius=" + c2.getRadius() +
                " height=" + c2.getHeight() +
                " surface area=" + c2.getArea() +
                " volume=" + c2.getVolume());

        // Deklarasi dan pembuatan objek Cylinder baru dengan radius dan tinggi yang ditentukan, tapi warna default
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3: radius=" + c3.getRadius() +
                " height=" + c3.getHeight() +
                " surface area=" + c3.getArea() +
                " volume=" + c3.getVolume());
    }
}
