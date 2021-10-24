package review._24_10.model;

import review._24_10.model.Candidates;

public class Intern extends Candidates {
    private String majors;
    private byte semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, byte semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int candidateId, String firstName, String lastName, String birthDate, String address, int phone, String email, byte candidateType, String majors, byte semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
