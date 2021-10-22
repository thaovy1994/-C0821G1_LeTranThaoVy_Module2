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

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
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

    //Method so sánh 2 đối tượng với nhau
    //Định nghĩa nên rule so sánh 2 object
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        Student otherStudent = (Student) obj;
        if (this.studentId == otherStudent.getStudentId()) {
            return true;
        }
        return false;
    }
}
