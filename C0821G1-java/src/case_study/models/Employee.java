package case_study.models;

public class Employee extends Person{
    private int Id;
    private String fullName;
    private String dateOfBirth;
    private boolean male = true;
    private String identifyNumber;
    private int phoneNumber;
    private String email;
    private String level;
    //Trung cấp, Cao đẳng, Đại học và sau đại học
    private String position;
    //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
    private float salary;
}
