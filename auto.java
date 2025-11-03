public class Auto extends Policy {
    private String vehicleMake;
    private String vehicleModel;

    public Auto(String policyNumber, String customerName, double policyAmount,
                String vehicleMake, String vehicleModel) {
        super(policyNumber, customerName, policyAmount);
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
    }

    @Override
    public void computeCommission() {
        commission = policyAmount * 0.05; // Example: 5% commission for auto
    }

    @Override
    public String toString() {
        return "AUTO " + super.toString() + 
               String.format(" | Vehicle: %s %s", vehicleMake, vehicleModel);
    }
}
