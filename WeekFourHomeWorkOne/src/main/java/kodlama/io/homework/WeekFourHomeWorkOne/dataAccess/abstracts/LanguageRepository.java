package kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language; 	
public interface LanguageRepository {

	public void add(Language language) throws Exception;

	public void update(Language language) throws Exception;

	public void delete(Language language) throws Exception;

	List<Language> getAll();
}
