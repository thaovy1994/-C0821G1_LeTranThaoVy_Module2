package case_study.models;

public class Employee extends Person {
    private String level;      //Trung cấp, Cao đẳng, Đại học và sau đại học
    private String position;   //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String id, String fullName, String dateOfBirth, boolean male, int identifyNumber, String phoneNumber, String email,
                    String level, String position, double salary) {
        super(id, fullName, dateOfBirth, male, identifyNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                this.getLevel() + "," +
                this.getPosition() + "," +
                this.getSalary();
    }
}
