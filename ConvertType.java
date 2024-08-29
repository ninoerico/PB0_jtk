class ConvertDataType // deklarasi kelas
{
    static short methodOne(long l) {
        //static short memiliki definisi untuk melakukan short dengan menggunakan methodOne
        int i = (int) l;
        // mengisi nilai dari integer i ke float
        return (short)i; // melakukan pengulangan
    }
    public static void main(String[] args)
    // deklarasi bahwa ini dapat dipanggil tanpa membuat class
    {
        double d = 10.25;
        // nilai yang awalnya adalah bertipe double adalah 10.25
        float f = (float) d;
        // nilai di lakukan downcasting dari double ke float
        byte b = (byte) methodOne((long) f);
        // dari nilai mulai dri konfersi downcasting ini nilai dalam bentuk byte memanggil methodone long f
        System.out.println(b);
        // menampilkan ourput dari b yaitu nilai yang sebelumnya telah di downcasting dan di lakukan perubahan nilai
    }
}
//import java.util.Scanner;
//public class ConvertDataType {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String A = scanner.next();
//        String B = scanner.next();
//
//        int lengthSum = A.length() + B.length();
//        System.out.println(lengthSum);
//
//        if (A.compareTo(B) > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
//        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
//        System.out.println(capitalizedA + " " + capitalizedB);
//    }
//}
