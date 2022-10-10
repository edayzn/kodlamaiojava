package WeekThreeHomeWorkOne.business;

import WeekThreeHomeWorkOne.entities.Customer;
import WeekThreeHomeWorkOne.entities.Person;

public class CustomerManager {
	
	
	private Customer customer;
	
	public CustomerManager(Customer customer) {
		super();
		this.customer = customer;
	}


	public void save() {
		
		System.out.println("Müþteri kaydedildi."+ customer.getId());
	}
	
}
