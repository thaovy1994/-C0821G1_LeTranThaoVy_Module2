package review._17_10.controller;

import review._17_10.model.Student;
import review._17_10.service.implement.StudentService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService myStudent = new StudentService();
        int choices = 0;
        System.out.println("---Manage Student---");
        System.out.println("1.Add new Student");
        System.out.println("2.Show student list");
        System.out.println("3.Edit a student information");
        System.out.println("4.Remove a student from list");
        System.out.println("5.Check id YYY if it is in list ? ");
        System.out.println("6.Input id and show his/her information, if id is not exist, alert ERROR ");
        System.out.println("7.Arrange student in point");
        System.out.println("0.Exit");
        do {
            System.out.print("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    //Cách 1: Cho user nhập vào list Student
//                    System.out.print("\tInput id: ");
//                    int studentId = Integer.parseInt(input.nextLine());
//                    System.out.print("\tInput name: ");
//                    String studentName = input.nextLine();
//                    System.out.print("\tInput address: ");
//                    String address = input.nextLine();
//                    System.out.print("\tInput point: ");
//                    int point = Integer.parseInt(input.nextLine());
//                    Student student = new Student(studentId, studentName, address, point);
//                    myStudent.addStudent(student);

//                    Cách 2: khởi tạo sẵn
                    myStudent.addStudent(new Student(1, "Mina", "LTT", 9));
                    myStudent.addStudent(new Student(2, "Rosie", "PCT", 7));
                    myStudent.addStudent(new Student(3, "LiLy", "HHT", 6));
                    break;
                case 2:
                    //Cách 1: dùng method showStudent()
                    //myStudent.showStudent();
                    //Cách 2: duyệt để hiển thị
                    //dùng count để hiển thị index trước mỗi dòng student
                    int count = 0;
                    for (Student student : myStudent.getMyList()) {
                        System.out.println(count++ + " : " + student);
                    }
                    break;
                case 3:
                    //lấy getter của my list -> ví dụ lấy index 1 -> trả về obj student
                    //Cách 1: user nhập
                    System.out.print("Enter index to edit: ");
                    int index =Integer.parseInt(input.nextLine());
                    Student student = myStudent.getMyList().get(index);

                    System.out.print("Input new id: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Input new name: ");
                    String name = input.nextLine();
                    System.out.print("Input new address: ");
                    String address = input.nextLine();
                    System.out.print("Input new point: ");
                    int point = Integer.parseInt(input.nextLine());
                    student.setStudentId(id);
                    student.setStudentName(name);
                    student.setAddress(address);
                    student.setPoint(point);

                    //Cách 2: nhập sẵn
//                    Student student = new Student(3,"Lisa","QN", 7);
                    myStudent.editInformation(student);
                    System.out.println("***************************");

                    for (Student student1 : myStudent.getMyList()) {
                        System.out.println(student1);
                    }
                    break;
                case 4:
                    System.out.println("Input index to remove");
                    int index1 = Integer.parseInt(input.nextLine());
                    myStudent.removeStudent(index1);
                    break;
                case 5:
                    System.out.print("Input id YYY: ");
                    int id2 = Integer.parseInt(input.nextLine());
                    Student student1 = new Student(id2);
                    myStudent.isExist(student1);
                    break;
                case 6:
                    System.out.println("Input id: ");
                    int id3 = Integer.parseInt(input.nextLine());
                    Student student3 = new Student(id3);
//                    myStudent.checkId(student3);
                    break;
                case 7:
                    myStudent.arrangeInPoint();
                    break;

            }
        } while (choices != 0);
    }
}
