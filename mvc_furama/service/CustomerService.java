package mvc_furama.service;

import mvc_furama.repository.CustomerRepository;
import mvc_furama.repository.ICustomerRepository;
import mvc_furama.model.Customer;
import mvc_furama.utils.CheckValidate;

import java.util.List;
import java.util.Objects;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        List<Customer> customerList = customerRepository.findAll();
        for (Customer c : customerList) {
            if (Objects.equals(c.getId(), customer.getId())) {
                System.out.println("Customer already exist");
                return false;
            } else {
                break;
            }
        }
        if (!CheckValidate.checkId1(customer.getId())) {
            System.out.println("Customer Id is not valid");
            return false;
        }
        if (!CheckValidate.checkName(customer.getName())) {
            System.out.println("Customer Name is not valid");
            return false;
        }
        if (!CheckValidate.checkDate(customer.getDate())) {
            System.out.println("Customer Date is not valid");
            return false;
        }
        if (!CheckValidate.checkIdCard(customer.getIdCard())) {
            System.out.println("Customer IdCard is not valid");
            return false;
        }
        if (!CheckValidate.checkPhone(customer.getPhone())) {
            System.out.println("Customer Phone is not valid");
            return false;
        }
        return customerRepository.add(customer);
    }
    @Override
    public boolean update(Customer customer) {
       boolean result = false;
       List<Customer> customerList = customerRepository.findAll();
       for (Customer c : customerList) {
           if (Objects.equals(c.getId(), customer.getId())) {
               result =true;
               break;
           }
       }
       if(!result){
           System.out.println("Customer Id is not valid");
           return false;
       }
        if (!CheckValidate.checkId1(customer.getId())) {
            System.out.println("Customer Id is not valid");
        }
        if (!CheckValidate.checkName(customer.getName())) {
            System.out.println("Customer Name is not valid");
        }
        if (!CheckValidate.checkDate(customer.getDate())) {
            System.out.println("Customer Date is not valid");
        }
        if (!CheckValidate.checkIdCard(customer.getIdCard())) {
            System.out.println("Customer IdCard is not valid");
        }
        if (!CheckValidate.checkPhone(customer.getPhone())) {
            System.out.println("Customer Phone is not valid");
        }
        return customerRepository.update(customer);
    }
}
