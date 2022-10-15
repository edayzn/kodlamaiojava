package WeekThreeHomeWorkThree.core.logging;

public class DatabaseLogger implements Logger<String> {

	@Override
	public void log(String data) {
		System.out.println("Veritabaný loglandý   :" + data);		
	}

}
