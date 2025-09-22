package mvc_furama.repository;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import mvc_furama.model.Employee;
import mvc_furama.utils.ReadAndWriteFile;

import java.io.IOException;


public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "src/mvc_furama/data/EmployeeData.csv";
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new LinkedList<>();

        {
            try {
                List<String> stringList = ReadAndWriteFile.readListStringFromCSV(EMPLOYEE_FILE);
                String[] array = null;
                for (String s : stringList) {
                    array = s.split(",");
                    Employee employee = new Employee(array[0], array[1], array[2]
                            , array[3], array[4]
                            , array[5], array[6], array[7], array[8]
                            , Integer.parseInt(array[9]));
                    employeeList.add(employee);
                }
            } catch (IOException e) {
                System.out.println("Error reading employee file!");
            }
            return employeeList;
        }
    }
    @Override
    public boolean add(Employee employee) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add(employee.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE,employeeList,true);
        } catch (IOException e) {
            System.out.println("Error adding employee file!");
            return false;
        }
        return true;
    }
    @Override
    public boolean update(Employee employee) {
        List<Employee> employeeList = findAll();
        boolean result = false;
        for(int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
                result = true;
                break;
            }
        }
        if(result){
            List<String> stringList = new ArrayList<>();
            for (Employee e : employeeList) {
                stringList.add(e.getInfoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE,stringList,false);
            } catch (IOException e) {
                System.out.println("Error updating employee file!");
            }
        }
        return result;
    }

}
