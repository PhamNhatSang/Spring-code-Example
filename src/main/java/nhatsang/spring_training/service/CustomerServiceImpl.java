package nhatsang.spring_training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nhatsang.spring_training.dao.CustomerDAO;
import nhatsang.spring_training.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public void update(Customer customer) {
        customerDAO.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDAO.delete(customer);
    }
}
