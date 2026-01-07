public class ClassReport {
private String gymClass;
private int enrollmentCount;
private double revenue;
private double averageRating;

    public ClassReport(String gymClass, int enrollmentCount, double revenue, double averageRating) {
        this.gymClass = gymClass;
        this.enrollmentCount = enrollmentCount;
        this.revenue = revenue;
        this.averageRating = averageRating;
    }

    public String getGymClass() {
        return gymClass;
    }

    public void setGymClass(String gymClass) {
        this.gymClass = gymClass;
    }

    public int getEnrollmentCount() {
        return enrollmentCount;
    }

    public void setEnrollmentCount(int enrollmentCount) {
        this.enrollmentCount = enrollmentCount;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
