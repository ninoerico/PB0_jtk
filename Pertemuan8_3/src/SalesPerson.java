public class Salesperson implements Comparable <Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales; // Ascending by sales
        } else {
            return other.lastName.compareTo(this.lastName); // Descending by last name in case of a tie
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales + " sales";
    }
}
