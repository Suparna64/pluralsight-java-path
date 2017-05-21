import com.jcsanchez.model.Customer;
import com.jcsanchez.repository.CustomerRepository;
import com.jcsanchez.repository.HibernateCustomerRepositoryImpl;
import com.jcsanchez.service.CustomerService;
import com.jcsanchez.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jsssn on 21-May-17.
 */
@Configuration
@ComponentScan({"com.jcsanchez"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service = new CustomerServiceImpl();
        //service.setCustomerRepository(getCustomerRepository());
        return service;
    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
