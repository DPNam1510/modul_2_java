package mvc_furama.service;
import mvc_furama.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean update(Employee employee);
}
