package review._17_11.service;

import review._17_11.model.Student;

public interface IStudentService {
    //    Student[] findAll();
    void addStudent(Student student);
    void showStudent();
    void editInformation(int index);
    void removeStudent(int index1);
    boolean checkId(Student studentId);
    void arrangeInPoint();
}
