package WeekThreeHomeWorkThree.business;

import WeekThreeHomeWorkThree.core.logging.Logger;
import WeekThreeHomeWorkThree.dataAccess.BaseDao;
import WeekThreeHomeWorkThree.entities.Course;

public class CourseManager {
	private BaseDao<Course> baseDao;
	private Logger<String>[] loggers;
	public CourseManager(BaseDao<Course> baseDao, Logger<String>[] loggers) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception{
		
		Course course2= new Course(1,"Java","Engin Demiroð",2500);
		if(course.getCourseName()== course2.getCourseName() || course.getPrice()<0) {
			throw new Exception("Kayýtlý kurs ismi ve ya kurs ücreti geçersiz!");
		}
		baseDao.add(course);
		for (Logger<String> logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	
	
}
