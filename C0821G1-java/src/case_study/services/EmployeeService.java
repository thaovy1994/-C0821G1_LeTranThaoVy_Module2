package case_study.services;

import case_study.models.Employee;
import case_study.models.Person;

public interface EmployeeService extends Service{
    void addEmployee(Employee employee);
    void edit(Employee employee);
    void changeInformation(Employee employee);
}
