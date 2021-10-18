package review._17_11.service.implement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import review._17_11.model.Student;
import review._17_11.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentService implements IStudentService {
    List<Student> myList = new ArrayList<Student>();
//    private ArrayList<Student> myList;
//
//    public StudentService() {
//        this.myList = new ArrayList<Student>();
//    }
//
//    public StudentService(ArrayList<Student> myList) {
//        this.myList = myList;
//    }

    @Override
    public void addStudent(Student student) {
        this.myList.add(student);
    }

    @Override
    public void showStudent() {
        for (Student student : myList) {
            System.out.println("Student: " + student.toString());
        }
    }

    @Override
    public void editInformation(int index) {
        for (int i = 0; i < myList.size(); i++) {
            myList.get(index).getStudentId();
            myList.get(index).getStudentName();
            myList.get(index).getAddress();
            myList.get(index).getPoint();
        }
    }

    @Override
    public void removeStudent(int index1) {
        myList.remove(index1);
    }

    @Override
    public boolean checkId(Student studentId) {
        if (studentId != myList) {
            System.out.println("ERROR");
        }
        return this.myList.contains(studentId);
    }

    @Override
    public void arrangeInPoint() {
        Collections.sort(myList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getPoint() < student2.getPoint()) {
                    return -1;
                } else if (student1.getPoint() > student2.getPoint()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}


