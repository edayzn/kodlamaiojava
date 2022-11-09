package kodlama.io.homework.WeekFourHomeWorkOne.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts.SubTechnologyService;
import kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.SubTechnology;
@Service
public class SubTechnologyManager implements SubTechnologyService{

	private SubTechnologyRepository subTechnologyRepository;
	
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
	}

	@Override
	public void add(SubTechnology subTechnology) throws Exception {
		subTechnologyRepository.save(subTechnology);
		
	}

	@Override
	public void update(int id,String name) throws Exception  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SubTechnology subTechnology) throws Exception {
		subTechnologyRepository.delete(subTechnology);
		
	}

	@Override
	public List<SubTechnology> getAll() {
		// TODO Auto-generated method stub
		return subTechnologyRepository.findAll();
	}

}
