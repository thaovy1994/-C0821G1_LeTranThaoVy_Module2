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
            System.out.println("1.Add New Student");
            System.out.println("2.Show Student List");
            System.out.println("3.Edit A Student information");
            System.out.println("4.Remove A Student");
            System.out.println("5.Check Id YYY if it is in list ? ");
            System.out.println("6.Input Id and show his/her information, if Id is not exist, alert ERROR ");
            System.out.println("7.Arrange Student in point");
            System.out.println("0.Exit");
            System.out.println("Please choose a number: ");
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    System.out.println("1.Add New Student");
                    System.out.println("Input id: ");
                    int id = Integer.parseInt(input.nextLine());
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
                    System.out.println("2.Show Student List");
//                    myStudent.showStudent();
                    break;
                case 3:
                    System.out.println("3.Edit A Student information");

                    break;
                case 4:
                    System.out.println("4.Remove A Student");
                    System.out.println("Input Index to remove");
                    int index1 = Integer.parseInt(input.nextLine());
//                    myStudent.removeStudent();
                    break;
                case 5:
                    System.out.println("5.Check Id YYY if it is in list ? ");
                    Student student1 = new Student();
//                    myStudent.checkId();
                    break;
                case 6:
                    System.out.println("6.Input Id and show his/her information, if Id is not exist, alert ERROR ");

                    break;
                case 7:
                    System.out.println("7.Arrange Student in point");
//                    myStudent.arrangeInPoint();
                    break;

            }
        } while (choices != 0);
    }
}
