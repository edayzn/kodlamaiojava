package kodlama.io.homework.WeekFourHomeWorkOne.business.abstracts;

import java.util.List;

import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.SubTechnology;

public interface SubTechnologyService {
	public void add(SubTechnology subTechnology) throws Exception;
	public void update(int id, String subTechnolgyName) throws Exception;
	public void delete(SubTechnology subTechnology) throws Exception;
	List<SubTechnology> getAll();
}
