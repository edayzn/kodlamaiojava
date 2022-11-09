package kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts;

import java.util.List;

import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language;

public interface LanguageService {
	public void add(Language language) throws Exception;
	public void update(int id,String name) throws Exception;
	public void delete(Language language) throws Exception;
	List<Language> getAll();
}
