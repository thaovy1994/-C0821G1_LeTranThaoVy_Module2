package review._17_10.service;

import review._17_10.model.Student;

public interface IStudentService {
    void addStudent(Student student);
    void showStudent();
    void editInformation(Student student);
    void removeStudent(int index1);
    boolean isExist(Student student);
    void arrangeInPoint();
}
