package review._17_11.service;

import review._17_11.model.Student;

public interface IStudentService {
    void addStudent(Student student);
    void showStudent();
    void editInformation(Student student);
    void removeStudent(int index1);
    boolean isExist(Student student);
    void arrangeInPoint();
}
