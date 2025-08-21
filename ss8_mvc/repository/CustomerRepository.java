package ss8_mvc.repository;

import ss8_mvc.entity.Customer;

public class CustomerRepository implements ICustomerRepository {
    private static Customer[] customers = new Customer[100];

    static {
        customers[0] = new Customer(1, "Nam", "nam@gmail.com", "Lien Chieu");
        customers[1] = new Customer(2, "Huy", "huy@gmail.com", "Thanh Khe");
        customers[2] = new Customer(3, "Nhat", "Nhat@gmail.com", "Thanh Khe");
    }

    @Override
    public Customer[] findAll() {
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
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
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != customer && customers[i].getId() == customer.getId()) {
                customers[i] = null;
                break;
            }
        }
        return false;
    }
}
