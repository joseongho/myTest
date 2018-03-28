package myDao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import myModel.MyDiary;

public class MyDiaryDaoImpl extends SqlSessionDaoSupport implements MyDiaryDao {

	@Override
	public void insertDiary(MyDiary myDiary) {
		getSqlSession().insert("myMapper.MyDiaryMapper.insertDiary", myDiary);
	}

	@Override
	public List<MyDiary> selectTitleDate() {
		return getSqlSession().selectList("myMapper.MyDiaryMapper.selectTitleDate");
	}

	@Override
	public MyDiary selectNumber(MyDiary myDiary) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("myMapper.MyDiaryMapper.selectNumber", myDiary);
	}
}
