package WeekThreeHomeWorkThree.dataAccess;

import WeekThreeHomeWorkThree.entities.Course;

public class CourseDao implements BaseDao<Course> {

	@Override
	public void add(Course o) {
		System.out.println("Kurs eklendi "+ o.getCourseName());
		
	}
	
}
