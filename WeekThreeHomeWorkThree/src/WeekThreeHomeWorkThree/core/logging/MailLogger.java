package WeekThreeHomeWorkThree.core.logging;

public class MailLogger implements Logger<String>{

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi   :" + data);
		
	}

}
