package review._17_11.model;

public class Student {
    private int studentId;
    private String studentName;
    private String address;
    private float point;

    public Student() {

    }

    public Student(int studentId, String studentName, String address, float point) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.point = point;
    }

    public int getStudentCode() {
        return this.studentId;
    }

    public void setStudentCode(int studentCode) {
        this.studentId = studentCode;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPoint() {
        return this.point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
