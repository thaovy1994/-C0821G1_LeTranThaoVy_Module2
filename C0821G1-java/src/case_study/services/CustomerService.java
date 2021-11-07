package case_study.services;

import case_study.models.Customer;

public interface CustomerService extends Service {
    void addCustomer(Customer customer);
    void changeInformation(Customer customer);
}
