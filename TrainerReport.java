public class TrainerReport {
    private String trainer;

    private String classesTaught;
    private int totalMembers;
    private double averageRating;

    public TrainerReport(String trainer, String classesTaught, int totalMembers, double averageRating) {
        this.trainer = trainer;
        this.classesTaught = classesTaught;
        this.totalMembers = totalMembers;
        this.averageRating = averageRating;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getClassesTaught() {
        return classesTaught;
    }

    public void setClassesTaught(String classesTaught) {
        this.classesTaught = classesTaught;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
