public class Home extends Policy {
    private String address;

    public Home(String policyNumber, String customerName, double policyAmount,
                String address) {
        super(policyNumber, customerName, policyAmount);
        this.address = address;
    }

    @Override
    public void computeCommission() {
        commission = policyAmount * 0.06; // Example: 6% for home
    }

    @Override
    public String toString() {
        return "HOME " + super.toString() +
               String.format(" | Address: %s", address);
    }
}
