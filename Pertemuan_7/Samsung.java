// Samsung yang mendukung fitur pintar dan kamera
class Samsung extends Handphone implements Features {
    public Samsung(String model) {
        super("Samsung", model);
    }
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Samsung " + model + " is calling " + phoneNumber);
    }
    @Override
    public void browseInternet() {
        System.out.println("Browsing internet on Samsung " + model);
    }
    @Override
    public void runApps() {
        System.out.println("Running apps on Samsung " + model);
    }
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with Samsung " + model);
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording video with Samsung " + model);
    }
}
