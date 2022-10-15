package WeekThreeHomeWorkThree.dataAccess;

import WeekThreeHomeWorkThree.entities.Category;

public class CategoryDao implements BaseDao<Category> {

	@Override
	public void add(Category o) {
		System.out.println("Kategori eklendi " + o.getCategoryName());

	}

}
