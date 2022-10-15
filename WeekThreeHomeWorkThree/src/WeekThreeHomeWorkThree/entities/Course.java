package WeekThreeHomeWorkThree.entities;

public class Course {
	private int id;
	private String courseName;
	private String instructor;
	private int price;

	public Course() {

	}

	public Course(int id, String courseName, String instructor, int price) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
