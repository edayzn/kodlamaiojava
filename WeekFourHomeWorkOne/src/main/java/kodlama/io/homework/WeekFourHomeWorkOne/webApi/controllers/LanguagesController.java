package kodlama.io.homework.WeekFourHomeWorkOne.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts.LanguageService;
import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;


	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);

	}

	@PutMapping("/update")
	public void update(int id,String name) throws Exception {
		languageService.update(id,name);
	}

	@DeleteMapping("/delete")
	public void delete(Language language) throws Exception {
		languageService.delete(language);
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();

	}
}
