package review._24_10.model;

import review._24_10.model.Candidates;

public class Experience extends Candidates {
    private byte expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(String candidateId, String firstName, String lastName, int birthDate, String address, int phone, String email, byte candidateType, byte expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public byte getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(byte expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
