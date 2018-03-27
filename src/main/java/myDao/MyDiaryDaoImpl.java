package myDao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import myModel.MyDiary;

public class MyDiaryDaoImpl extends SqlSessionDaoSupport implements MyDiaryDao {

	/* (non-Javadoc)
	 * @see myDao.MyDiaryDao#insertDiary(myModel.MyDiary)
	 */
	@Override
	public void insertDiary(MyDiary myDiary) {
		getSqlSession().insert("myMapper.MyDiaryMapper.insertDiary", myDiary);
	}
}
