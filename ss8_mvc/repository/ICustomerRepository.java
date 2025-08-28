package ss8_mvc.repository;
import ss8_mvc.entity.Customer;
public interface ICustomerRepository {
Customer[] findAll();
boolean add(Customer customer);
Customer findById(int id);
boolean delete(Customer customer);
}
