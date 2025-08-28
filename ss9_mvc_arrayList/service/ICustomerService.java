package ss9_mvc_arrayList.service;

import ss9_mvc_arrayList.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean add(Customer customer);
    Customer findById(int id);
    boolean delete(Customer customer);
}
