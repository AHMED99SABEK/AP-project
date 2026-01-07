import java.util.Date;
public class Attendance {
    private int attendanceID;
    private Member member;
    private GymClass gymClass;
    private Date attendanceDate;
    public Attendance(int attendanceID, Member member, GymClass gymClass, Date attendanceDate){
        this.attendanceID = attendanceID;
        this.member = member;
        this.gymClass = gymClass;
        this.attendanceDate = attendanceDate;
    }
    public int getAttendanceID(){
        return attendanceID;
    }
    public Member getMember(){
        return member;
    }
    public GymClass getGymClass(){
        return gymClass;
    }
    public Date getAttendanceDate(){
        return attendanceDate;
    }
    public void setAttendanceID(int attendanceID){
        this.attendanceID = attendanceID;
    }
    public void setMember(Member member){
        this.member = member;
    }
    public void setGymClass(GymClass gymClass){
        this.gymClass = gymClass;
    }
    public void setAttendanceDate(Date attendanceDate){
        this.attendanceDate = attendanceDate;
    }
    public void markAttendance(){
        System.out.println("Attendance marked for " + gymClass.getClassName() + " by " + member.getName().getFullName());
    }
    public void viewAttendanceInfo(){
        System.out.println("Attendance ID: " + attendanceID);
        System.out.println("Member: " + member.getName().getFullName());
        System.out.println("Gym Class: " + gymClass.getClassName());
        System.out.println("Attendance Date: " + attendanceDate);
    }
}
