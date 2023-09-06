package nhatsang.spring_training.service;

import java.util.List;

import nhatsang.spring_training.model.Customer;

public interface CustomerService {
    void save(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
    void update(Customer customer);
    void delete(Customer customer);
}
