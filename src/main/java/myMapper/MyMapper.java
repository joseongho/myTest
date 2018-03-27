package myMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myModel.User;

public interface MyMapper {
	@Select("SELECT * FROM test.users WHERE id = #{userId}")
	User getUser(@Param("userId") String userId);
}