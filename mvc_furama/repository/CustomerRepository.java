package mvc_furama.repository;

import mvc_furama.model.Customer;
import mvc_furama.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_FILE = "src/mvc_furama/data/CustomerData.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readListStringFromCSV(CUSTOMER_FILE);
            String[] arr = null;
            for (String s : stringList) {
                arr = s.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2],
                        arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> customerList = new ArrayList<>();
        customerList.add(customer.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE,customerList,true);
        } catch (IOException e) {
            System.out.println("Error writing to file");
            return false;
        }
        return true;
    }
    @Override
    public boolean update(Customer customer) {
       List<Customer> customerList = findAll();
       boolean result = false;
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
                result = true;
                break;
            }
        }
        if(result) {
            List<String> stringList = new ArrayList<>();
            for(Customer c : customerList) {
                stringList.add(c.getInfoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE,stringList,false);
            } catch (IOException e) {
                System.out.println("Error reading from file");
            }
        }
        return result;
    }
}
