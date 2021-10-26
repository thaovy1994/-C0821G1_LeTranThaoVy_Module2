package review._24_10.model;

import review._24_10.model.Candidates;

public class Experience extends Candidates {
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(byte expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String candidateId, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidateType, int expInYear, String proSkill) {
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
