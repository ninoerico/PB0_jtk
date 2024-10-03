
// Apple yang mendukung fitur pintar dan kamera
class Apple extends Handphone implements Features {
    public Apple(String model) {
        super("Apple", model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Apple " + model + " is calling " + phoneNumber);
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet on Apple " + model);
    }

    @Override
    public void runApps() {
        System.out.println("Running apps on Apple " + model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with Apple " + model);
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video with Apple " + model);
    }
}

