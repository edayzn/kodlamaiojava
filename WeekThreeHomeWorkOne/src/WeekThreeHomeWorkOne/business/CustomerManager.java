package WeekThreeHomeWorkOne.business;

import WeekThreeHomeWorkOne.entities.Customer;
import WeekThreeHomeWorkOne.entities.Person;

public class CustomerManager {

	private Customer customer;
	private CreditManager creditManager;

	public CustomerManager(Customer customer, CreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {

		System.out.println("Müþteri kaydedildi.");
	}

	public void delete() {
		System.out.println("Müþteri silindi.");
	}

	public void giveCredit() {
		creditManager.calculate();
		creditManager.save();
		System.out.println("Kredi verildi.");
	}

}
