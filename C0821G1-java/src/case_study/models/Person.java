package case_study.models;

public abstract class Person {
    private int id;
    private String fullName;
    private String dateOfBirth;
    private boolean male = true;
    private int identifyNumber;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String fullName, String dateOfBirth, boolean male, int identifyNumber, int phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.male = male;
        this.identifyNumber = identifyNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
