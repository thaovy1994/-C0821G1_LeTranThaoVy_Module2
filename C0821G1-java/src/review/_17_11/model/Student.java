package review._17_11.model;

public class Student {
    private String studentId;
    private String studentName;
    private String address;
    private float point;

    public Student() {

    }

    public Student(String studentId, String studentName, String address, float point) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.point = point;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentCode) {
        this.studentId = studentId;
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
