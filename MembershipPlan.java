public class MembershipPlan {
    private String planId;
    private String planName;
    private String duration;
    private double price;

    private String benefits;

    public MembershipPlan(String planId, String planName, String duration, double price, String benefits) {
        this.planId = planId;
        this.planName = planName;
        this.duration = duration;
        this.price = price;
        this.benefits = benefits;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
