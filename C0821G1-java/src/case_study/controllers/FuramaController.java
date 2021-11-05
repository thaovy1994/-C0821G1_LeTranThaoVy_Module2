package case_study.controllers;

import case_study.models.*;
import case_study.services.CustomerService;
import case_study.services.EmployeeService;
import case_study.services.FacilityService;
import case_study.services.implement.CustomerServiceImpl;
import case_study.services.implement.EmployeeServiceImpl;
import case_study.services.implement.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        System.out.println("*----------- MENU -----------*");
        System.out.println("* 1. Employee Management.    *");
        System.out.println("* 2. Customer Management.    *");
        System.out.println("* 3. Facility Management.    *");
        System.out.println("* 4. Booking Management.     *");
        System.out.println("* 5. Promotion Management.   *");
        System.out.println("* 6. Exit.                   *");
        System.out.println("*------------ *** -----------*");
        System.out.print("Please choose menu option: ");
    }

    public static void displayEmployeeMenu() {
        System.out.println(" -------- Employee --------- *");
        System.out.println("1.\tDisplay list employees   *");
        System.out.println("2.\tAdd new employee         *");
        System.out.println("3.\tEdit employee            *");
        System.out.println("4.\tReturn main menu         *");
        System.out.println(" --------------------------- *");
        System.out.print("Please choose employee's option: ");

    }

    public static void displayCustomerMenu() {
        System.out.println(" -------- Customers -------- *");
        System.out.println("1.\tDisplay list customers   *");
        System.out.println("2.\tAdd new customers        *");
        System.out.println("3.\tEdit customers           *");
        System.out.println("4.\tReturn main menu         *");
        System.out.println(" --------------------------- *");
        System.out.print("Please choose customers's option: ");
    }

    public static void displayfacilityMenu() {
        System.out.println(" -------- Facility --------- *");
        System.out.println("1.\tDisplay list facility    *");
        System.out.println("2.\tAdd new facility         *");
        System.out.println("3.\tEdit facility            *");
        System.out.println("4.\tReturn main menu         *");
        System.out.println(" --------------------------- *");
        System.out.print("Please choose facility's option: ");
    }

    public static void displayBookingMenu() {
        System.out.println(" --------- Booking --------- *");
        System.out.println("1.\tAdd new booking          *");
        System.out.println("2.\tDisplay list booking     *");
        System.out.println("3.\tCreate new contracts     *");
        System.out.println("4.\tDisplay list contracts   *");
        System.out.println("5.\tEdit contracts           *");
        System.out.println("6.\tReturn main menu         *");
        System.out.println(" --------------------------- *");
        System.out.print("Please choose booking's option: ");
    }

    public static void displayPromotionMenu() {
        System.out.println(" ------------- Promotion -------------- *");
        System.out.println("1.\tDisplay list customers use service  *");
        System.out.println("2.\tDisplay list customers get voucher  *");
        System.out.println("3.\tReturn main menu                    *");
        System.out.println(" -------------------------------------- *");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        FacilityService facilityService = new FacilityServiceImpl();

        int choices;
        do {
            displayMainMenu();
            choices = Integer.parseInt(input.nextLine());
            switch (choices) {
                case 1:
                    displayEmployeeMenu();
                    while (true) {
                        int employeeOption = Integer.parseInt(input.nextLine());
                        switch (employeeOption) {
                            case 1:
                                employeeService.show();
                                displayEmployeeMenu();
                                break;
                            case 2:
                                Employee empolyee = new Employee();
                                employeeService.addEmployee(empolyee);
                                displayEmployeeMenu();
                                break;
                            case 3:
                                System.out.print("Enter index to edit: ");
                                int index = Integer.parseInt(input.nextLine());
                                Employee empolyee1 = (Employee) ((EmployeeServiceImpl) employeeService).getEmployeeList().get(index);
                                employeeService.changeInformation(empolyee1);
                                employeeService.edit(empolyee1);
                                displayEmployeeMenu();
                                break;
                            case 4:
                                FuramaController.main(args);
                        }
                    }
                case 2:
                    displayCustomerMenu();
                    while (true) {
                        int customerOption = Integer.parseInt(input.nextLine());
                        switch (customerOption) {
                            case 1:
                                customerService.show();
                                break;
                            case 2:
                                Customer customer = new Customer();
                                customerService.addCustomer(customer);
                                break;
                            case 3:
                                System.out.print("Enter index to edit: ");
                                int index = Integer.parseInt(input.nextLine());
                                Customer customer1 = (Customer) CustomerServiceImpl.getCustomerList().get(index);
                                customerService.changeInformation(customer1);
                                customerService.edit(customer1);
                                break;
                            case 4:
                                FuramaController.main(args);
                        }
                    }
                case 3:
                    displayfacilityMenu();
                    while (true) {
                        int facilityOption = Integer.parseInt(input.nextLine());
                        switch (facilityOption) {
                            case 1:
                                facilityService.show();
                                break;
                            case 2:

                                facilityService.create();
                            case 3:
//                                facilityService.edit();
                                break;
                            case 4:
                                FuramaController.main(args);
                        }
                    }
                case 4:
                    displayBookingMenu();
                    while (true) {
                        int bookingOption = Integer.parseInt(input.nextLine());
                        switch (bookingOption) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                FuramaController.main(args);
                        }
                    }
                case 5:
                    displayPromotionMenu();
                    while (true) {
                        System.out.print("Please choose promotion's option: ");
                        int promotion = Integer.parseInt(input.nextLine());
                        switch (promotion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                FuramaController.main(args);
                        }
                    }
                case 6:
                    System.exit(6);
            }
        } while (choices != 6);
    }
}
