public class Life extends Policy {
    private int age;

    public Life(String policyNumber, String customerName, double policyAmount, int age) {
        super(policyNumber, customerName, policyAmount);
        this.age = age;
    }

    @Override
    public void computeCommission() {
        commission = policyAmount * 0.04; // Example: 4% for life
    }

    @Override
    public String toString() {
        return "LIFE " + super.toString() +
               String.format(" | Age: %d", age);
    }
}
