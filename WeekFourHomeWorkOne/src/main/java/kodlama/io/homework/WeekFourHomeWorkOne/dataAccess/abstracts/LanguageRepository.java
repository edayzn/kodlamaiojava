package kodlama.io.homework.WeekFourHomeWorkOne.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes.Language; 	
@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{
//	@Modifying
//	@Query("update Language u set u.languageName = : languageName where u.id=:id")
//	public void update(@Param("id") int id,@Param("languageName") String languageName);

	

}
