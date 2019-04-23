import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.customer.Address;
import com.customer.Customer;
import com.customer.Customer.CustomerType;

public class MartTest {

	@Before
	public void setUp() throws Exception {
		Customer customer = createCustomer("REGULAR");
	}

	@Test
	public void test() {
		
	}
	
	private Customer createCustomer(String type){
		Customer customer = null;
		if(type.equalsIgnoreCase(CustomerType.REGULAR)){
			customer = new Customer(1, "customer1", "customer1", new Address(), CustomerType.REGULAR);
		}else if(type.equalsIgnoreCase(CustomerType.PREMIUM)){
			customer = new Customer(1, "customer1", "customer1", new Address(), CustomerType.REGULAR);
		}
		 
	}

}
