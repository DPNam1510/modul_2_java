package mvc_furama.service;

import mvc_furama.model.Employee;
import mvc_furama.repository.IEmployeeRepository;
import mvc_furama.repository.EmployeeRepository;
import mvc_furama.utils.CheckValidate;

import java.util.List;
import java.util.Objects;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee e : employeeList) {
            if (e != null) {
                if (Objects.equals(e.getId(), employee.getId())) {
                    System.out.println("Employee already exist");
                    return false;
                }
            } else {
                break;
            }
        }
        if (!CheckValidate.checkId(employee.getId())) {
            System.out.println("Employee Id is invalid");
            return false;
        }
        if (!CheckValidate.checkName(employee.getName())) {
            System.out.println("Employee Name is invalid");
            return false;
        }
        if (!CheckValidate.checkDate(employee.getDate())) {
            System.out.println("Employee Date is invalid");
            return false;
        }
        if (!CheckValidate.checkIdCard(employee.getIdCard())) {
            System.out.println("Employee IdCard is invalid");
            return false;
        }
        if (!CheckValidate.checkPhone(employee.getPhone())) {
            System.out.println("Employee Phone is invalid");
            return false;
        }
        if (!CheckValidate.checkSalary(employee.getSalary())) {
            System.out.println("Employee Salary is invalid");
            return false;
        }
        return employeeRepository.add(employee);
    }

    @Override
    public boolean update(Employee employee) {
        boolean result = false;
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee e : employeeList) {
            if (Objects.equals(e.getId(), employee.getId())) {
                result = true;
                break;
            }
        }
        if(!result){
            System.out.println("Employee Id is invalid");
            return false;
        }
        if (!CheckValidate.checkId(employee.getId())) {
            System.out.println("Employee Id is invalid");
            return false;
        }
        if (!CheckValidate.checkName(employee.getName())) {
            System.out.println("Employee Name is invalid");
            return false;
        }
        if (!CheckValidate.checkDate(employee.getDate())) {
            System.out.println("Employee Date is invalid");
            return false;
        }
        if (!CheckValidate.checkIdCard(employee.getIdCard())) {
            System.out.println("Employee IdCard is invalid");
            return false;
        }
        if (!CheckValidate.checkPhone(employee.getPhone())) {
            System.out.println("Employee Phone is invalid");
            return false;
        }
        if (!CheckValidate.checkSalary(employee.getSalary())) {
            System.out.println("Employee Salary is invalid");
            return false;
        }
        return employeeRepository.update(employee);
    }
}
