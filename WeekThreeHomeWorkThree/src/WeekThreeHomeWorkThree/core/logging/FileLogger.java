package WeekThreeHomeWorkThree.core.logging;

public class FileLogger implements Logger<String> {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandý  :" + data);
		
	}

}
