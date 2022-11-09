package kodlama.io.homework.WeekFourHomeWorkOne.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts.LanguageService;
import kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts.LanguageRepository;
import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		languageRepository.save(language);
	}

	@Override
	public void delete(Language language) throws Exception {
		languageRepository.delete(language);

	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.findAll();
	}

	@Override
	public void update(int id, String languageName) throws Exception {
		//languageRepository.update(id, languageName);

	}

}
