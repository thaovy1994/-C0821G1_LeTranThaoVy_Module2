package case_study.models;

public class Person {
    private String id;
    private String fullName;
    private String dateOfBirth;
    private boolean male = true;
    private int identifyNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dateOfBirth, boolean male, int identifyNumber, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.male = male;
        this.identifyNumber = identifyNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(int identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getId() + "," +
                this.getFullName() + "," +
                this.getDateOfBirth() + "," +
                this.isMale() + "," +
                this.getIdentifyNumber() + "," +
                this.getPhoneNumber() + "," +
                this.getEmail();
    }
}
