public class RewardValue {
    // Store the cash and miles values
    private double cashValue;
    private double milesValue;

    // Cash value constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Miles value conversion
        this.milesValue = cashValue * 0.0035;
    }

    // Miles value constructor
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            // Cash value conversion
            this.cashValue = milesValue / 0.0035;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue * 0.0035;
        }
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
