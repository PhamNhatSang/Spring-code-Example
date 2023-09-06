package nhatsang.spring_training.dao;

import java.util.List;

import nhatsang.spring_training.model.Customer;

public interface CustomerDAO {
    void save(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
    void update(Customer customer);
    void delete(Customer customer);
}
