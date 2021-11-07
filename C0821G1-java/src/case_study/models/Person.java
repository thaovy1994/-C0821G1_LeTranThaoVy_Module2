package case_study.models;

public class Person<T> {
    private String id;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private int identifyNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dateOfBirth, String gender, int identifyNumber, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
                this.getGender() + "," +
                this.getIdentifyNumber() + "," +
                this.getPhoneNumber() + "," +
                this.getEmail();
    }
}
