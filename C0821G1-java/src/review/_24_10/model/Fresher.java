package review._24_10.model;

import review._24_10.model.Candidates;

public class Fresher extends Candidates {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
        super();
    }

    public Fresher(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return this.getCandidateId() + ","
                + this.getFirstName() + ","
                + this.getLastName() + ","
                + this.getBirthDate() + ","
                + this.getAddress() + ","
                + this.getPhone() + ","
                + this.getEmail() + ","
//                + this.getCandidateType() + ","
                + this.getGraduationDate() + ","
                + this.getGraduationRank() + ","
                + this.getEducation();
    }
}
