public class GenericsTypeOld {
    private Object t;
    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
        System.out.println("String: " + str);
    }
}

// karena angka aeception tidak bisa di rubah dan
// ini adalah casting dan tidak dapat menerapkan objek ini adalah cara lama yaitu casting atau cara lama
// cara baru yaitu lebih dimamis dimana t dan t dapat di analogikan  dan karena variable ny t maka dimana main diset dengan string dan ini membuat ny menjadi string
// dimana generic dinamis akan membuat membuat ny menyeseuaikan apa yang di inginkan  sesuai dengan untuk apa dan tipe datanya harus di get dan  [dan saat memanggil tipe type harus diberikan dulu