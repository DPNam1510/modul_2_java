package mvc_furama.repository;
import java.util.List;
import mvc_furama.model.Customer;
public interface ICustomerRepository {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean update(Customer customer);
}
