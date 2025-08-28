package ss8_mvc.service;

import ss8_mvc.entity.Customer;
import ss8_mvc.repository.CustomerRepository;
import ss8_mvc.repository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public Customer[] findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return  customerRepository.add(customer);
    }
    @Override
    public Customer findById(int id){
        return customerRepository.findById(id);
    }
    @Override
public boolean delete(Customer customer){
        return customerRepository.delete(customer);
    }

}
