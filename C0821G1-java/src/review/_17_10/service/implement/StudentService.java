package review._17_10.service.implement;

import review._17_10.model.Student;
import review._17_10.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentService implements IStudentService {
    //Cách 1: Khai báo đối tượng or list rỗng -> user chỉ chọn 1 chức năng là tạo mới.
    //List<Student> myList = new ArrayList<Student>();

    //Cách 2: cung cấp user 2 lựa chọn: tạo mới or sử dụng cái có sẵn.
    //Khai báo thuộc tính myList với constructor và getter/setter.
    private ArrayList<Student> myList;

    public StudentService() {
        this.myList = new ArrayList<Student>();
    }

    public StudentService(ArrayList<Student> myList) {
        this.myList = myList;
    }

    public ArrayList<Student> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Student> myList) {
        this.myList = myList;
    }

    @Override
    public void addStudent(Student student) {
        this.myList.add(student);
    }

    @Override
    public void showStudent() {
        for (Student student : myList) {
            System.out.println("\tStudent: " + student.toString());
        }
    }

    @Override
    public void editInformation(Student student) {
        //check "student" mà mình truyền vào có trong list ko ?
        int index = myList.indexOf(student);
        if (index == -1) {
            //có thể alert "ERROR" hoặc lựa chọn add() nếu không có
            addStudent(student);
        } else {
            myList.set(index, student);
        }
    }

    @Override
    public void removeStudent(int index1) {
        if (index1 < 0 || index1 >= myList.size()) {
            System.out.println("Index not found" + index1);
        } else {
            myList.remove(index1);
        }
    }

    @Override
    public boolean isExist(Student student) {
        return myList.contains(student);
    }

    @Override
    public void arrangeInPoint() {
        Collections.sort(myList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                double result = student1.getPoint() - student2.getPoint();
                if (result > 0) {
                    return -1;
                } else if (result < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}


