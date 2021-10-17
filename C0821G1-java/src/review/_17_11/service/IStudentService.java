package review._17_11.service;

import review._17_11.model.Student;

public interface IStudentService {
    //    Student[] findAll();
    void addStudent(Student student);
    void showStudent();
    void EditInformation();
    void removeStudent(int index);
    boolean checkId(Student studentId);
    void arrangeInPoint();
}
