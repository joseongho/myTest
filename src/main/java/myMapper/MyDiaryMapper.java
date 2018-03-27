package myMapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import myModel.MyDiary;

public interface MyDiaryMapper {
	@Insert("INSERT INTO `test`.`my_diary` (`title`, `content`, `good_thing`, `bad_thing`, `to_do`) VALUES(#{title}, #{content}, #{goodThing}, #{badThing}, #{toDo})")
	void insertDiary(@Param("myDiary")MyDiary myDiary);
}
