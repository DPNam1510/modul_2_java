package ss8_mvc.service;
import ss8_mvc.entity.Customer;
public interface ICustomerService {
    Customer[] findAll();
    boolean add(Customer customer);
    Customer findById(int id);
    boolean delete(Customer customer);
}
