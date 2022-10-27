package WeekThreeHomeWorkThree;

import WeekThreeHomeWorkThree.business.CategoryManager;
import WeekThreeHomeWorkThree.business.CourseManager;
import WeekThreeHomeWorkThree.core.logging.DatabaseLogger;
import WeekThreeHomeWorkThree.core.logging.Logger;
import WeekThreeHomeWorkThree.core.logging.MailLogger;
import WeekThreeHomeWorkThree.dataAccess.HibernateDao;
import WeekThreeHomeWorkThree.dataAccess.JdbcDao;
import WeekThreeHomeWorkThree.entities.Category;
import WeekThreeHomeWorkThree.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] logger= {new MailLogger(),new DatabaseLogger()};
		Category category=new Category(1,"Frontend");
		CategoryManager categoryManager=new CategoryManager(new JdbcDao<Category>(),logger);
		categoryManager.add(category);
		
		Course course= new Course(2,".Net","Engin Demiroð",-250);
		CourseManager courseManager=new CourseManager(new HibernateDao<Course>(), logger);
		courseManager.add(course);
		
		
	}

}
