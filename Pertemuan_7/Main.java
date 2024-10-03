public class Main {
    public static void main(String[] args) {
        Handphone samsung = new Samsung("Galaxy S21");
        samsung.showInfo();
        samsung.makeCall("123-456-7890");
        ((Samsung) samsung).browseInternet();
        ((Samsung) samsung).takePhoto();
        ((Samsung) samsung).runApps();
        ((Samsung) samsung).recordVideo();

        System.out.println();

        Handphone apple = new Apple("iPhone 13");
        apple.showInfo();
        apple.makeCall("555-555-5555");
        ((Apple) apple).browseInternet();
        ((Apple) apple).takePhoto();
        ((Apple) apple).runApps();
        ((Apple) apple).recordVideo();

        System.out.println();
    }
}
