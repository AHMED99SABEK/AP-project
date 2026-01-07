import java.util.ArrayList;
import java.util.Date;
public class Member extends Person{
    private int memberID;
    private String membershipTier;
    private Date joinDate;
    private Date expiryDate;
    private MembershipPlan membershipPlan;
    private ArrayList<GymClass> enrolledClasses;
    private ArrayList<Attendance> attendanceHistory;
    private ArrayList<Feedback> feedbackHistory;
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
        this.membershipTier = membershipPlan.getTier();
        this.joinDate = new Date();
        int durationMonths = 0;
        try {
            durationMonths = Integer.parseInt(membershipPlan.getDuration());
        } catch (NumberFormatException e) {
            durationMonths = 1;
        }
        this.expiryDate = new Date(joinDate.getTime() + (long)durationMonths * 30L * 24 * 60 * 60 * 1000);
    }
    public void enrollClass(GymClass gymClass){
        if (this.enrolledClasses == null) {
            this.enrolledClasses = new ArrayList<>();
        }
        this.enrolledClasses.add(gymClass);
    }

    public void submitFeedback(GymClass gymClass, int rating, String comment){
        String memberIDStr = String.valueOf(this.memberID);
        String classIDStr = gymClass.getClassID();
        String dateStr = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        float ratingFloat = (float) rating;
        String commentStr = comment;
        String memberNameStr = this.getName() != null ? this.getName().getFullName() : "Unknown";

        Feedback feedback = new Feedback(memberIDStr, classIDStr, dateStr, ratingFloat, commentStr, memberNameStr);
        if (this.feedbackHistory == null) {
            this.feedbackHistory = new ArrayList<>();
        }
        this.feedbackHistory.add(feedback);
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
        System.out.println("Feedback: " + feedbackHistory);
        for (Feedback feedback : feedbackHistory) {
            feedback.viewFeedbackInfo();
        }
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
