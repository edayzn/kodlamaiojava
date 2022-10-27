package kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts.LanguageRepository;
import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languages;
	Language programminglanguage;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "JAVA"));
		languages.add(new Language(2, "C#"));
	}

	public InMemoryLanguageRepository(List<Language> languages, Language programminglanguage) {
		super();
		this.languages = languages;
		this.programminglanguage = programminglanguage;
	}

	@Override
	public void add(Language language) throws Exception {
		for (Language pLanguage : languages) {
			if (pLanguage.getLanguageName().equals(language.getLanguageName())) {
				throw new Exception("Kayıtlı programla dili bulunmaktadır.");
			} else
				languages.add(new Language(language.getId(), language.getLanguageName()));
		}

	}

	@Override
	public void update(Language language) throws Exception {

		for (Language pLanguage : languages) {
			if (pLanguage.getId() == language.getId()) {
				programminglanguage.setLanguageName(language.getLanguageName());
			} else
				throw new Exception("Bilgiler uyuşmuyor. Güncelleme başarısız!");
		}

	}

	@Override
	public void delete(Language language) throws Exception {
		for (Language pLanguage : languages) {
			if (pLanguage.getId() == language.getId()) {
				System.out.println("Kayıt silindi.");
			} else
				throw new Exception();
		}
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

}
