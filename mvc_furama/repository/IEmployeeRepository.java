package mvc_furama.repository;
import mvc_furama.model.Employee;
import java.util.List;
public interface IEmployeeRepository {
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean update(Employee employee);
}
