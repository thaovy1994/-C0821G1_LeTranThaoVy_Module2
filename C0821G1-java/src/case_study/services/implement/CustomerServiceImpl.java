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
    ReadAndWriteServiceImpl readAndWriteService = new ReadAndWriteServiceImpl();

    public CustomerServiceImpl() {
    }

    public static List<Person> getCustomerList() {
        return customerList;
    }

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("CN1997", "yibo", "05/08/1997",
                "male", 1231231234, "0909090909",
                "yibo@gmail.com", "Platinium", "LuoYang"));
    }

    @Override
    public void addCustomer(Customer customer) {
        try {
            System.out.print("Enter customer's ID: ");
            customer.setId(input.nextLine());
            System.out.print("Enter customer's full name: ");
            customer.setFullName(input.nextLine());
            System.out.print("Enter customer's date of birth: ");
            String dateOfBirth = Validation.checkDateOfBirth();
            System.out.print("Are customer's male/felmale ? ");
            String gender = Validation.checkGender();
            System.out.print("Enter customer's identify number: ");
            customer.setIdentifyNumber(Integer.parseInt(input.nextLine()));
            System.out.print("Enter customer's phone number: ");
            customer.setPhoneNumber(input.nextLine());
            System.out.print("Enter customer's email: ");
            customer.setEmail(input.nextLine());

            System.out.print("Enter customer's type (Diamond/Platinium/Gold/Silver/private String customerAddress): ");
            String type = Validation.checkServiceName();
            System.out.print("Enter customer's address: ");
            customer.setCustomerAddress(input.nextLine());
            customerList.add(new Customer(customer.getId(), customer.getFullName(), dateOfBirth,
                    gender, customer.getIdentifyNumber(), customer.getPhoneNumber(), customer.getEmail(),
                    type, customer.getCustomerAddress()));
            readAndWriteService.writeFileList("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\customer.csv", customerList);
        } catch (NumberFormatException e) {
            System.err.print("Wrong format ! ");
        } catch (Exception e) {
            System.out.println("Enter again");
        }
    }


    @Override
    public void edit(Object customer) {
        int index = customerList.indexOf(customer);
        if (index == -1) {
            addCustomer((Customer) customer);
        } else {
            customerList.set(index, (Customer) customer);
            readAndWriteService.writeFileList("D:\\C0821G1_LeTranThaoVy_Module2\\C0821G1-java\\src\\case_study\\data\\customer.csv", customerList);
        }
    }

    @Override
    public void show(String path) {
        List<Person> customerList = new ArrayList<>();
        System.out.println("***** List Customer *****");
        readAndWriteService.readFileList(path, customerList);
        for (Object customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("         * * *");
    }

    @Override
    public void changeInformation(Customer customer) {
            try {
                System.out.print("Enter Id to change: ");
                String id = input.nextLine();
                System.out.print("Enter full name to change: ");
                String fullName = input.nextLine();
                System.out.print("Enter date of birth to change: ");
                String birthday = Validation.checkDateOfBirth();
                System.out.print("Enter gender (male/female) to change: ");
                String gender = Validation.checkGender();
                System.out.print("Enter identify number to change: ");
                int identifyNumber = Integer.parseInt(input.nextLine());
                System.out.print("Enter phone number to change: ");
                String phoneNumber = input.nextLine();
                System.out.print("Enter mail to change: ");
                String email = input.nextLine();
                System.out.print("Enter type (Diamond/Platinium/Gold/Silver/private String customerAddress) to change: ");
                String type = Validation.checkServiceName();
                System.out.print("Enter address to change: ");
                String address = input.nextLine();
                customer.setId(id);
                customer.setFullName(fullName);
                customer.setDateOfBirth(birthday);
                customer.setGender(gender);
                customer.setIdentifyNumber(identifyNumber);
                customer.setPhoneNumber(phoneNumber);
                customer.setEmail(email);
                customer.setCustomerType(type);
                customer.setCustomerAddress(address);
            } catch (NumberFormatException e) {
                System.err.print("Wrong format ! ");
            } catch (Exception e) {
                System.out.println("Enter again");
            }
        }
    }