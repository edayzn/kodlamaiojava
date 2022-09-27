package homeWorkTwo;

import classesWithAttributes.Product;
import classesWithAttributes.ProductManager;
import inheritance.Customer;
import inheritance.CustomerManager;
import inheritance.Employee;
import inheritance.EmployeeManager;
import inheritanceDemo.AskeriKrediManager;
import inheritanceDemo.BaseKrediManager;
import inheritanceDemo.KrediUI;
import inheritanceDemo.OgretmenKrediManager;
import inheritanceDemo.TarimKrediManagaer;

public class Main {

	public static void main(String[] args) {
 
		Methods methods = new Methods();
		methods.sayibulmaca();
		
		System.out.println(methods.topla(2580, 157));
		
		methods.topla(1, 2, 9, 10);
		
		String sehir = methods.sehirVer();
		System.out.println(sehir);
		
		Product product=new Product();
		product.setId(1);
		product.setProductName("Laptop");
		product.setDescription("Asus LAptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		 
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
		//inheritance
		
		Customer customer=new Customer();
		Employee employee=new Employee();
		customer.setFirstName("Müþteri");
		customer.setAge(20);
		employee.setFirstName("Çalýþan");
		employee.setAge(25);
		System.out.println(customer.getFirstName() +" "+ customer.getAge());
		System.out.println(employee.getFirstName() +" "+ employee.getAge());
	
	
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.BestEmployee(employee);
		
		//inheritanceDemo
	
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManagaer());
		krediUI.KrediHesapla(new AskeriKrediManager());
	}
	

}
