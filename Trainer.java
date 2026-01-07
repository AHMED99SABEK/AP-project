import java.util.ArrayList;
public class Trainer extends Person {
    private int trainerID;
    private String specialization;
    private String certifications;
    private ArrayList<GymClass> assignedClasses;
    public Trainer(int id, Name name, String phone, String email, String password, int trainerID, String specialization, String certifications){
        super(id, name, phone, email, password);
        this.trainerID = trainerID;
        this.specialization = specialization;
        this.certifications = certifications;
    }
    public int getTrainerID(){
        return trainerID;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getCertifications(){
        return certifications;
    }
    public ArrayList<GymClass> getAssignedClasses(){
        return assignedClasses;
    }
    public void setTrainerID(int trainerID){
        this.trainerID = trainerID;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setCertifications(String certifications){
        this.certifications = certifications;
    }
    public void setAssignedClasses(ArrayList<GymClass> assignedClasses){
        this.assignedClasses = assignedClasses;
    }
    public void viewSchedule() {
        System.out.println("Trainer ID: " + trainerID);
        System.out.println("Specialization: " + specialization);
        System.out.println("Certifications: " + certifications);
        System.out.println("Assigned Classes: " + assignedClasses);
    }
    public void markAttendance(GymClass gymClass) {
        System.out.println("Attendance marked for " + gymClass.getClassName() + " by " + this.getName().getFullName());
    }
    public void viewEnrolledMembers(GymClass gymClass) {
        System.out.println("Enrolled Members: " + gymClass.getEnrolledMembers());
    }
}
