// Abstract class Handphone
abstract class Handphone {
    protected String brand;
    protected String model;

    public Handphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method
    public abstract void makeCall(String phoneNumber);

    // Common method for all handphones
    public void showInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
