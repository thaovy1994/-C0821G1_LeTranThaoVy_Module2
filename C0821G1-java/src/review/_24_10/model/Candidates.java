package review._24_10.model;

public class Candidates {
    private int candidateId;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private int phone;
    private String email;
    private byte candidateType; //0: for Experience, 1: for Fresher candidate, 2: for Intern candidate

    public Candidates(){}

    public Candidates(int candidateId, String firstName, String lastName, int birthDate, String address, int phone, String email, byte candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public Candidates(int candidateId, String firstName, String lastName, int birthDate, int phone, String graduationRank) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.candidateType = candidateType;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(byte candidateType) {
        this.candidateType = candidateType;
    }
}
