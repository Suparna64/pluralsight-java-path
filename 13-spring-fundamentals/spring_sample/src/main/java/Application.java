import com.jcsanchez.service.CustomerService;
import com.jcsanchez.service.CustomerServiceImpl;

/**
 * Created by jsssn on 20-May-17.
 */
public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
