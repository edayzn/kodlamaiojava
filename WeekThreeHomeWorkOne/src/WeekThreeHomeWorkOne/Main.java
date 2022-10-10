package WeekThreeHomeWorkOne;

import WeekThreeHomeWorkOne.business.CustomerManager;
import WeekThreeHomeWorkOne.entities.Company;
import WeekThreeHomeWorkOne.entities.Customer;
import WeekThreeHomeWorkOne.entities.Person;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);

		Customer customer = new Customer();

		customer.setId(1);
		customer.setCity("Ankara");

		CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.save();

		Person person = new Person();
		person.setFirstName("Engin");
		person.setLastName("Demiroð");
		person.setNationalIdentity("123456");

		Company company = new Company();
		company.setTaxNumber("10000");
		company.setCompanyName("Bosh");
		company.setId(100);
		
		
		CustomerManager customerManager2 = new CustomerManager(new Company());
		

	}

}
