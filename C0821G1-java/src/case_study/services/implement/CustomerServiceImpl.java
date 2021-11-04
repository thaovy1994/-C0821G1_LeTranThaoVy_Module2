package case_study.services.implement;

import case_study.models.Customer;
import case_study.models.Person;
import case_study.services.CustomerService;
import case_study.utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner input = new Scanner(System.in);
    public static List<Person> customerList;

    public CustomerServiceImpl() {
    }

    public static List<Person> getCustomerList() {
        return customerList;
    }

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("CN1997", "yibo", "05/08/1997",
                true, 1231231234, "0909090909",
                "yibo@gmail.com", "Platinium", "LuoYang"));
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.print("Enter customer's ID: ");
        customer.setId(input.nextLine());
        System.out.print("Enter customer's full name: ");
        customer.setFullName(input.nextLine());
        System.out.print("Enter customer's date of birth: ");
        customer.setDateOfBirth(input.nextLine());
        System.out.print("Are customer's male/felmale ? ");
        boolean gender = Validation.checkGender();
        System.out.print("Enter customer's identify number: ");
        customer.setIdentifyNumber(Integer.parseInt(input.nextLine()));
        System.out.print("Enter customer's phone number: ");
        customer.setPhoneNumber(input.nextLine());
        System.out.print("Enter customer's email: ");
        customer.setEmail(input.nextLine());

        System.out.print("Enter customer's type (Diamond/Platinium/Gold/Silver/private String customerAddress): ");
        String type = Validation.checkCustomerType();
        System.out.print("Enter customer's address: ");
        customer.setCustomerAddress(input.nextLine());
        customerList.add(new Customer(customer.getId(), customer.getFullName(), customer.getDateOfBirth(),
                gender, customer.getIdentifyNumber(), customer.getPhoneNumber(), customer.getEmail(),
                type, customer.getCustomerAddress()));
    }

    @Override
    public void edit(Customer customer) {
        int index = customerList.indexOf(customer);
        if (index == -1) {
            addCustomer(customer);
        } else {
            customerList.set(index, customer);
        }
    }

    @Override
    public void show() {
        System.out.println("***** List Customer *****");
        for (Person empl : customerList) {
            System.out.println(empl);
        }
        System.out.println("         * * *");
    }

    @Override
    public void changeInformation(Customer customer) {
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
        System.out.print("Enter type (Diamond/Platinium/Gold/Silver/private String customerAddress) to change: ");
        String type = Validation.checkCustomerType();
        System.out.print("Enter address to change: ");
        String address = input.nextLine();
        customer.setId(id);
        customer.setFullName(fullName);
        customer.setDateOfBirth(birthday);
        customer.setMale(gender);
        customer.setIdentifyNumber(identifyNumber);
        customer.setPhoneNumber(phoneNumber);
        customer.setEmail(email);
        customer.setCustomerType(type);
        customer.setCustomerAddress(address);
    }
}
