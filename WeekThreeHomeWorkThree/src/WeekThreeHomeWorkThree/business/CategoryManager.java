package WeekThreeHomeWorkThree.business;

import WeekThreeHomeWorkThree.dataAccess.BaseDao;
import WeekThreeHomeWorkThree.entities.Category;
import WeekThreeHomeWorkThree.core.logging.*; 

public class CategoryManager {
	private BaseDao<Category> baseDao;
	private Logger<String>[] loggers;

	public CategoryManager(BaseDao<Category> baseDao, Logger<String>[] loggers) {
		super();
		this.baseDao = baseDao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception{
		Category category2=new Category(1,"Backend");
		if(category.getCategoryName().equals(category2.getCategoryName())) {
			throw new Exception("Bu isimde kategori var!.");
		}
		
		baseDao.add(category);
		for (Logger<String> logger : loggers) {
			logger.log(category.getCategoryName());
		}
		}
	}
	
