import java.util.ArrayList;
public class Admin extends Person {
    private int adminID;
    private ArrayList<Member> memberList;
    private ArrayList<Trainer> trainerList;
    public Admin(int id, Name name, String phone, String email, String password, int adminID){
        super(id, name, phone, email, password);
        this.adminID = adminID;
    }
    public int getAdminID(){
        return adminID;
    }
    public ArrayList<Member> getMemberList(){
        return memberList;
    }
    public ArrayList<Trainer> getTrainerList(){
        return trainerList;
    }
    public void setAdminID(int adminID){
        this.adminID = adminID;
    }
    public void setMemberList(ArrayList<Member> memberList){
        this.memberList = memberList;
    }
    public void setTrainerList(ArrayList<Trainer> trainerList){
        this.trainerList = trainerList;
    }
    public void addMember(Member member){
        memberList.add(member);
    }
    public void removeMember(Member member){
        memberList.remove(member);
    }
    public void addTrainer(Trainer trainer){
        trainerList.add(trainer);
    }
    public void removeTrainer(Trainer trainer){
        trainerList.remove(trainer);
    }
    public void generateReport(){
        System.out.println("Report generated for " + memberList.size() + " members and " + trainerList.size() + " trainers");
    }
    public void manageFeedback(){
        System.out.println("Feedback management");
    }
    public void viewMemberList(){
        System.out.println("Member List: " + memberList);
    }
    public void viewTrainerList(){
        System.out.println("Trainer List: " + trainerList);
    }
    public void viewAdminInfo(){
        System.out.println("Admin ID: " + adminID);
    }
    public void viewAdminProfile(){
        System.out.println("Admin ID: " + adminID);
        System.out.println("Name: " + this.getName().getFullName());
        System.out.println("Phone Number: " + this.getPhoneNo());
        System.out.println("Email: " + this.getEmail());
    }
}
