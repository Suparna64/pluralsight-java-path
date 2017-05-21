import com.jcsanchez.model.Customer;
import com.jcsanchez.service.CustomerService;
import com.jcsanchez.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jsssn on 20-May-17.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        //CustomerService service = new CustomerServiceImpl();

        CustomerService service =
                appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
