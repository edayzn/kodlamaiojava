package WeekThreeHomeWorkOne.business;

public abstract class BaseCreditManager implements CreditManager {
	
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Kredi Kaydedildi.");

	}

}
