public abstract class Person {
    protected int personID;
    protected Name name;
    protected String phoneNo;
    protected String email;
    protected String password;
    public Person(int id, Name name, String phone, String email, String password){
        this.personID = id;
        this.name = name;
        this.phoneNo = phone;
        this.email = email;
        this.password = password;
    }
    public int getPersonID(){
        return personID;
    }
    public Name getName(){
        return name;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPhoneNo(String phone){
        this.phoneNo = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setName(Name name){
        this.name = name;
    }
    public void setPersonID(int id){
        this.personID = id;
    }
    public boolean verifyLogin(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    public void displayProfile() {
        System.out.println("Person ID: " + personID);
        System.out.println("Name: " + name.getFullName());
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Email: " + email);
    }
}
