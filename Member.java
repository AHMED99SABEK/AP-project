import java.util.ArrayList;
import java.util.Date;
public class Member extends Person{
    private int memberID;
    private String membershipTier;
    private Date joinDate;
    private Date expiryDate;
    private ArrayList<GymClass> enrolledClasses;
    private ArrayList<Attendance> attendanceHistory;
    public Member(int id, Name name, String phone, String email, String password, int memberID, String membershipTier, Date joinDate, Date expiryDate){
        super(id, name, phone, email, password);
        this.memberID = memberID;
        this.membershipTier = membershipTier;
    }
    public int getMemberID(){
        return memberID;
    }
    public String getMembershipTier(){
        return membershipTier;
    }
    public Date getJoinDate(){
        return joinDate;
    }
    public Date getExpiryDate(){
        return expiryDate;
    }
    public ArrayList<GymClass> getEnrolledClasses(){
        return enrolledClasses;
    }
    public ArrayList<Attendance> getAttendanceHistory(){
        return attendanceHistory;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }
    public void setMembershipTier(String membershipTier){
        this.membershipTier = membershipTier;
    }
    public void setJoinDate(Date joinDate){
        this.joinDate = joinDate;
    }
    public void setExpiryDate(Date expiryDate){
        this.expiryDate = expiryDate;
    }
    public void setEnrolledClasses(ArrayList<GymClass> enrolledClasses){
        this.enrolledClasses = enrolledClasses;
    }
    public void setAttendanceHistory(ArrayList<Attendance> attendanceHistory){
        this.attendanceHistory = attendanceHistory;
    }
    public void registerMembership(MembershipPlan membershipPlan){
        this.membershipTier = membershipPlan.getMembershipTier();
        this.joinDate = new Date();
        this.expiryDate = new Date(joinDate.getTime() + membershipPlan.getDuration() * 30 * 24 * 60 * 60 * 1000);
    }
    public void enrollClass(GymClass gymClass){
        this.enrolledClasses.add(gymClass);
    }
    public void submitFeedback(GymClass gymClass, int rating, String comment){
        Feedback feedback = new Feedback(this, gymClass, rating, comment);
        gymClass.addFeedback(feedback);
    }
    public void viewSchedule(){
        System.out.println("Member ID: " + memberID);
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Join Date: " + joinDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
    public void viewAttendanceHistory(){
        System.out.println("Attendance History: " + attendanceHistory);
    }
    public void viewEnrolledClasses(){
        System.out.println("Enrolled Classes: " + enrolledClasses);
    }
    public void viewFeedback(){
        System.out.println("Feedback: " + feedback);
    }
    public void viewPersonalInfo(){
        System.out.println("Personal Information: " + this.getName().getFullName());
        System.out.println("Phone Number: " + this.getPhoneNo());
        System.out.println("Email: " + this.getEmail());
    }
    public void viewMembershipInfo(){
        System.out.println("Membership Information: " + this.getMembershipTier());
        System.out.println("Join Date: " + this.getJoinDate());
        System.out.println("Expiry Date: " + this.getExpiryDate());
    }
}
