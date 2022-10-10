package WeekThreeHomeWorkOne.entities;

public class Customer {
	private int id;
	private String city;

	
	public Customer() {
		System.out.println("Müþteri nesenesi baþlatýldý.");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


}
