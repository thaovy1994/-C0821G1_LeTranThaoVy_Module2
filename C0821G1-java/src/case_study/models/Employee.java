package case_study.models;

public class Employee extends Person{
    private String level;      //Trung cấp, Cao đẳng, Đại học và sau đại học
    private String position;   //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private float salary;

    public Employee(){
    }

    public Employee(int id, String fullName, String dateOfBirth, boolean male, int identifyNumber, int phoneNumber, String email, String level, String position, float salary) {
        super(id, fullName, dateOfBirth, male, identifyNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
}
