package case_study.services;

import case_study.models.Customer;
import case_study.models.Employee;

public interface CustomerService extends Service {
    void addCustomer(Customer customer);
    void edit(Customer customer);
    void changeInformation(Customer customer);
}
