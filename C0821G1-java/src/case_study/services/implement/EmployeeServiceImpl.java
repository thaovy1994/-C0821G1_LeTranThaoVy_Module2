package case_study.services.implement;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.services.EmployeeService;
import case_study.utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner input = new Scanner(System.in);
    public static List<Person> employeeList;

    public EmployeeServiceImpl() {
    }

    public List<Person> getEmployeeList() {
        return employeeList;
    }

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("DN1994", "thaovy", "13/01/1994",
                false, 123456789, "0123456789",
                "thaovy@gmail.com", "college", "Supervisor", 5000));

    }

    @Override
    public void addEmployee(Employee employee) {
        System.out.print("Enter your ID: ");
        employee.setId(input.nextLine());
        System.out.print("Enter your full name: ");
        employee.setFullName(input.nextLine());
        System.out.print("Enter your date of birth: ");
        employee.setDateOfBirth(input.nextLine());
        System.out.print("Are you male/felmale ?");
        boolean gender = Validation.checkGender();
        System.out.print("Enter your identify number: ");
        employee.setIdentifyNumber(Integer.parseInt(input.nextLine()));
        System.out.print("Enter your phone number: ");
        employee.setPhoneNumber(input.nextLine());
        System.out.print("Enter your email: ");
        employee.setEmail(input.nextLine());

        System.out.print("Enter your level (intermediate/associate/college/postgraduate): ");
        String level = Validation.checkEmployeeLevel();
        System.out.print("Enter your position (Receptionist/Staff/Senior/Supervisor/Manager/GM): ");
        String position = Validation.checkEmployeeposition();
        System.out.print("Enter your salary: ");
        double salary = Integer.parseInt(input.nextLine());
        employeeList.add(new Employee(employee.getId(), employee.getFullName(), employee.getDateOfBirth(),
                gender, employee.getIdentifyNumber(), employee.getPhoneNumber(), employee.getEmail(),
                level, position, salary));
    }

    @Override
    public void edit(Employee employee) {
        int index = employeeList.indexOf(employee);
        if (index == -1) {
            addEmployee((Employee) employee);
        } else {
            employeeList.set(index, employee);
        }
    }

    @Override
    public void show() {
        System.out.println("***** List Employee *****");
        for (Person empl : employeeList) {
            System.out.println(empl);
        }
        System.out.println("          * * *");
    }

    public void changeInformation(Employee employee) {
        System.out.print("Enter Id to change: ");
        String id = input.nextLine();
        System.out.print("Enter full name to change: ");
        String fullName = input.nextLine();
        System.out.print("Enter date of birth to change: ");
        String birthday = input.nextLine();
        System.out.print("Enter gender (male/female) to change: ");
        boolean gender = Validation.checkGender();
        System.out.print("Enter identify number to change: ");
        int identifyNumber = Integer.parseInt(input.nextLine());
        System.out.print("Enter phone number to change: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter mail to change: ");
        String email = input.nextLine();
        System.out.print("Enter your level (intermediate/associate/college/postgraduate) to change: ");
        String level = input.nextLine();
        System.out.print("Enter your position (Receptionist/Staff/Senior/Supervisor/Manager/GM) to change: ");
        String position = input.nextLine();
        System.out.print("Enter salary to change: ");
        double salary = Double.parseDouble(input.nextLine());
        employee.setId(id);
        employee.setFullName(fullName);
        employee.setDateOfBirth(birthday);
        employee.setMale(gender);
        employee.setIdentifyNumber(identifyNumber);
        employee.setPhoneNumber(phoneNumber);
        employee.setEmail(email);
        employee.setLevel(level);
        employee.setPosition(position);
        employee.setSalary(salary);
    }
}
