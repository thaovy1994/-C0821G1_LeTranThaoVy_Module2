package case_study.services;

import case_study.models.Employee;

public interface EmployeeService extends Service {
    void addEmployee(Employee employee);
    void changeInformation(Employee employee);
}
