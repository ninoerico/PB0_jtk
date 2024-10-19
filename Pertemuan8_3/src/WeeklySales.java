
public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] staff = new Salesperson[6];
        staff[0] = new Salesperson("John", "Doe", 30);
        staff[1] = new Salesperson("Jane", "Smith", 40);
        staff[2] = new Salesperson("Adam", "Jones", 30);
        staff[3] = new Salesperson("Karen", "Doe", 20);
        staff[4] = new Salesperson("Emily", "Clark", 40);
        staff[5] = new Salesperson("James", "Doe", 30);
        Sorting.insertionSort(staff);

        System.out.println("Salespeople sorted by total sales (descending) and name:");
        for (Salesperson sp : staff) {
            System.out.println(sp);
        }
    }
}
