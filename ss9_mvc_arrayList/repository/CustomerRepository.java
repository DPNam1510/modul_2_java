package ss9_mvc_arrayList.repository;

import ss9_mvc_arrayList.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1,"Nam","nam@gmail.com","Lien Chieu"));
        customers.add(new Customer(2,"Huy","huy@gmail.com","Thanh khe"));
        customers.add(new Customer(3,"Nhat","nhat@gmail.com","Thanh khe"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i) == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }


    @Override
    public boolean delete(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i) != customer && customers.get(i).getId() == customer.getId()) {
                return true;
            }
        }
        return false;
    }
}
