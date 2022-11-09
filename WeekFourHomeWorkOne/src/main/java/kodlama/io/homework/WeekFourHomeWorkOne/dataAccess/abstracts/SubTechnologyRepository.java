package kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.SubTechnology;
@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>{

}
