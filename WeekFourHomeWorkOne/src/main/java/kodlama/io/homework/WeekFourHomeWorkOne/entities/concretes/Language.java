package kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes;

public class Language {
	private int id;
	private String languageName;
	public Language() {
		super();
	}
	public Language(int id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
}
