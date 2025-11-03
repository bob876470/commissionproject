public abstract class Policy {
    protected String policyNumber;
    protected String customerName;
    protected double policyAmount;
    protected double commission;

    public Policy(String policyNumber, String customerName, double policyAmount) {
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.policyAmount = policyAmount;
    }

    // Abstract method to be implemented by each derived class
    public abstract void computeCommission();

    public double getCommission() {
        return commission;
    }

    @Override
    public String toString() {
        return String.format("Policy #%s | Customer: %s | Amount: $%.2f | Commission: $%.2f",
                policyNumber, customerName, policyAmount, commission);
    }
}
