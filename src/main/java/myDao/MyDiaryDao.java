package myDao;

import java.util.List;

import myModel.MyDiary;

public interface MyDiaryDao {

	void insertDiary(MyDiary myDiary);

	List<MyDiary> selectTitleDate();
	
	MyDiary selectNumber(MyDiary myDiary);
}