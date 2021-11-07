package case_study.services.implement;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.services.EmployeeService;
import case_study.services.ReadAndWriteService;
import case_study.services.Service;
import case_study.utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService, Service {
    Scanner input = new Scanner(System.in);
    public static List<Person> employeeList;
    ReadAndWriteServiceImpl readAndWriteService = new ReadAndWriteServiceImpl();

    public EmployeeServiceImpl() {
    }

    public static List<Person> getEmployeeList() {
        return employeeList;
    }

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("DN1994", "thaovy", "13/01/1994",
                "female", 123456789, "0123456789",
                "thaovy@gmail.com", "college", "Supervisor", 5000));

    }

    @Override
    public void addEmployee(Employee employee) {
        try {
            System.out.print("Enter your ID: ");
            employee.setId(input.nextLine());
            System.out.print("Enter your full name: ");
            employee.setFullName(input.nextLine());
            System.out.print("Enter your date of birth (dd/mm/yy): ");
            String dateOfBirth = Validation.checkDateOfBirth();
            System.out.print("Are you male/felmale ? ");
            String gender = Validation.checkGender();
            System.out.print("Enter your identify number: ");
            employee.setIdentifyNumber(Integer.parseInt(input.nextLine()));
            System.out.print("Enter your phone number: ");
            employee.setPhoneNumber(input.nextLine());
            System.out.print("Enter your email: ");
            employee.setEmail(input.nextLine());

            System.out.print("Enter your level (Intermediate/Associate/College/Postgraduate/...): ");
            String level = Validation.checkServiceName();
            System.out.print("Enter your position (Receptionist/Staff/Senior/Supervisor/Manager/...): ");
            String position = Validation.checkServiceName();
            System.out.print("Enter your salary: ");
            double salary = Integer.parseInt(input.nextLine());
            employeeList.add(new Employee(employee.getId(), employee.getFullName(), dateOfBirth,
                    gender, employee.getIdentifyNumber(), employee.getPhoneNumber(), employee.getEmail(),
                    level, position, salary));

            readAndWriteService.writeFileList("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\employee.csv", employeeList);

        } catch (NumberFormatException e) {
            System.err.print("Wrong format ! \n");
        } catch (Exception e) {
            System.out.println("Enter again");
        }
    }

    @Override
    public void edit(Object employee) {
        int index = employeeList.indexOf(employee);
        if (index == -1) {
            addEmployee((Employee) employee);
        } else {
            employeeList.set(index, (Employee) employee);
            readAndWriteService.writeFileList("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\employee.csv", employeeList);
        }
    }

    @Override
    public void show(String path) {
        List<Person> employeeList = new ArrayList<>();
        System.out.println("***** List Employee *****");
        readAndWriteService.readFileList(path, employeeList);
        for (Object empl : employeeList) {
            System.out.println(empl);
        }
        System.out.println("          * * *");
    }

    @Override
    public void changeInformation(Employee employee) {
            try {
                System.out.print("Enter Id to change: ");
                String id = input.nextLine();
                System.out.print("Enter full name to change: ");
                String fullName = input.nextLine();
                System.out.print("Enter date of birth to change: ");
                String dateOfBirth = Validation.checkDateOfBirth();
                System.out.print("Enter gender (male/female) to change: ");
                String gender = Validation.checkGender();
                System.out.print("Enter identify number to change: ");
                int identifyNumber = Integer.parseInt(input.nextLine());
                System.out.print("Enter phone number to change: ");
                String phoneNumber = input.nextLine();
                System.out.print("Enter mail to change: ");
                String email = input.nextLine();
                System.out.print("Enter your level (Intermediate/Associate/College/Postgraduate/...) to change: ");
                String level = Validation.checkServiceName();
                System.out.print("Enter your position (Receptionist/Staff/Senior/Supervisor/Manager/...) to change: ");
                String position = Validation.checkServiceName();
                System.out.print("Enter salary to change: ");
                double salary = Double.parseDouble(input.nextLine());
                employee.setId(id);
                employee.setFullName(fullName);
                employee.setDateOfBirth(dateOfBirth);
                employee.setGender(gender);
                employee.setIdentifyNumber(identifyNumber);
                employee.setPhoneNumber(phoneNumber);
                employee.setEmail(email);
                employee.setLevel(level);
                employee.setPosition(position);
                employee.setSalary(salary);
            } catch (NumberFormatException e) {
                System.err.print("Wrong format ! ");
            } catch (Exception e) {
                System.out.println("Enter again");
            }
        }
    }
