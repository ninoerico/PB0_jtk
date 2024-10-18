public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;
    public Commission(String name, String address, String phone, String ssn, double payRate, double commissionRate) {
        super(name, address, phone, ssn, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double basePay = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0;
        return basePay + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
