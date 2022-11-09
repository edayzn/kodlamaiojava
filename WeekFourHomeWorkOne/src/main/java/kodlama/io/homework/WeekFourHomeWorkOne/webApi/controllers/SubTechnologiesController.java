package kodlama.io.homework.WeekFourHomeWorkOne.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts.SubTechnologyService;
import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.SubTechnology;

@RestController
@RequestMapping("/api/subTechnologies")
public class SubTechnologiesController {

	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}

	@PostMapping("/add")
	public void add(SubTechnology subTechnology) throws Exception {
		subTechnologyService.add(subTechnology);

	}

	@PutMapping("/update")
	public void update(int id, String subTechnolgyName) throws Exception {
		subTechnologyService.update(id,subTechnolgyName);
	}

	@DeleteMapping("/delete")
	public void delete(SubTechnology subTechnology) throws Exception {
		subTechnologyService.delete(subTechnology);
	}

	@GetMapping("/getall")
	public List<SubTechnology> getAll() {
		return subTechnologyService.getAll();

	}
}
