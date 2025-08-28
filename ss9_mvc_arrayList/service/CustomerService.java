package ss9_mvc_arrayList.service;

import ss9_mvc_arrayList.entity.Customer;
import ss9_mvc_arrayList.repository.CustomerRepository;
import ss9_mvc_arrayList.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
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
