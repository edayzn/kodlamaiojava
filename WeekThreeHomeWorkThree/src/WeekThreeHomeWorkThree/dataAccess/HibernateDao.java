package WeekThreeHomeWorkThree.dataAccess;

public class HibernateDao<T> implements BaseDao<T> {

	@Override
	public void add(T o) {
		System.out.println("Hibernate ile veritabanýna eklendi.");
		
	}

}
