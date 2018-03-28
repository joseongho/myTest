package myMapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myModel.MyDiary;

public interface MyDiaryMapper {
	@Insert("INSERT INTO `test`.`my_diary` (`title`, `content`, `good_thing`, `bad_thing`, `to_do`) VALUES(#{title}, #{content}, #{goodThing}, #{badThing}, #{toDo})")
	void insertDiary(@Param("myDiary") MyDiary myDiary);

	@Select("SELECT number, title, date FROM `test`.`my_diary` order by number desc limit 5")
	List<MyDiary> selectTitleDate();

	@Select("SELECT * FROM `test`.`my_diary` where number=#{number}")
	MyDiary selectNumber(@Param("myDiary") MyDiary myDiary);
}
