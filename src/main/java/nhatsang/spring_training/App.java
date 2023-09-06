package nhatsang.spring_training;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import nhatsang.spring_training.model.Customer;
import nhatsang.spring_training.service.CustomerService;

public class App 
{
	public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            CustomerService customerService = context.getBean("customerServiceImpl", CustomerService.class);
            Customer newCustomer = new Customer();
            newCustomer.setFirstName("John");
            newCustomer.setLastName("Doe");
            customerService.save(newCustomer);

            Customer foundCustomer = customerService.findById(1);
            System.out.println("Found Customer: " + foundCustomer.getFirstName() + " " + foundCustomer.getLastName());
            foundCustomer.setLastName("Smith");
            customerService.update(foundCustomer);

            List<Customer> customers = customerService.findAll();
            System.out.println("All Customers:");
            for (Customer customer : customers) {
                System.out.println(customer.getFirstName() + " " + customer.getLastName());
            }

            customerService.delete(foundCustomer);
        }
    }
}
