package review._17_11.controller;

import review._17_11.model.Student;
import review._17_11.service.implement.StudentService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService myStudent = new StudentService();
        int choices = 0;
        do {
            System.out.println("Manage Student");
            System.out.println("1.Add new Student");
            System.out.println("2.Show student list");
            System.out.println("3.Edit a student information");
            System.out.println("4.Remove a student from list");
            System.out.println("5.Check id YYY if it is in list ? ");
            System.out.println("6.Input id and show his/her information, if id is not exist, alert ERROR ");
            System.out.println("7.Arrange student in point");
            System.out.println("0.Exit");
            System.out.print("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    System.out.println("1.Add new Student");
                    System.out.println("Input id: ");
                    String id = input.nextLine();
                    System.out.println("Input name: ");
                    String name = input.nextLine();
                    System.out.println("Input address: ");
                    String address = input.nextLine();
                    System.out.println("Input average point: ");
                    int point = Integer.parseInt(input.nextLine());
                    Student student = new Student(id, name, address, point);
                    myStudent.addStudent(student);
                    break;
                case 2:
                    System.out.println("2.Show student list");
                    myStudent.showStudent();
                    break;
                case 3:
                    System.out.println("3.Edit a student information");
                    System.out.println("Input id: ");
                    String id1 = input.nextLine();
                    System.out.println("Input name: ");
                    String name1 = input.nextLine();
                    System.out.println("Input address: ");
                    String address1 = input.nextLine();
                    System.out.println("Input average point: ");
                    int point1 = Integer.parseInt(input.nextLine());
                    Student student2 = new Student(id1, name1, address1, point1);
//                    myStudent.editInformation(student2.setStudentId(id1));
                    break;
                case 4:
                    System.out.println("4.Remove a student");
                    System.out.println("Input index to remove");
                    int index1 = Integer.parseInt(input.nextLine());
                    myStudent.removeStudent(index1);
                    break;
                case 5:
                    System.out.println("5.Check id YYY if it is in list ? ");
                    System.out.print("Input id YYY: ");
                    String id2 = input.nextLine();
                    Student student1 = new Student(id2);
                    myStudent.checkId(student1);
                    break;
                case 6:
                    System.out.println("6.Input id and show his/her information, if id is not exist, alert ERROR ");
                    System.out.println("Input id: ");
                    String id3 = input.nextLine();
                    Student student3 = new Student(id3);
                    myStudent.checkId(student3);
                    break;
                case 7:
                    System.out.println("7.Arrange student in point");
                    myStudent.arrangeInPoint();
                    break;

            }
        } while (choices != 0);
    }
}
