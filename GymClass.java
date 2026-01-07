


public class GymClass {


    private String classID;
    private String className;
    private String schedule;
    private int capacity;
    private int enrolledCount;
    private double classFee;

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public void setEnrolledCount(int enrolledCount) {
        this.enrolledCount = enrolledCount;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getClassFee() {
        return classFee;
    }

    public void setClassFee(double classFee) {
        this.classFee = classFee;
    }

    public GymClass(String classID, String className, String schedule, int capacity, int enrolledCount, double classFee) {
        this.classID = classID;
        this.className = className;
        this.schedule = schedule;
        this.capacity = capacity;
        this.enrolledCount = enrolledCount;
        this.classFee = classFee;
    }
}











