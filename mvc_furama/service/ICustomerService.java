package mvc_furama.service;

import mvc_furama.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    boolean add(Customer customer);

    boolean update(Customer customer);
}
