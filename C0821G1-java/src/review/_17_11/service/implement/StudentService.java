package review._17_11.service.implement;

import review._17_11.model.Student;
import review._17_11.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentService implements IStudentService {
    private ArrayList<Student> myList;

    public StudentService() {
        this.myList = new ArrayList<Student>();
    }

    public StudentService(ArrayList<Student> myList) {
        this.myList = myList;
    }

    @Override
    public void addStudent(Student student) {
        this.myList.add(student);
    }

    @Override
    public void showStudent() {
        for (Student student : myList) {
            System.out.println("Student: ");
        }
    }

    @Override
    public void EditInformation() {

    }

    @Override
    public void removeStudent(int index) {
        this.myList.remove(index);
    }

    @Override
    public boolean checkId(Student studentId) {
        return this.myList.contains(studentId);
    }

    @Override
    public void arrangeInPoint() {
        Collections.sort(this.myList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student12) {
                if (student1.getPoint() < student12.getPoint()) {
                    return -1;
                } else if (student1.getPoint() > student12.getPoint()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}

