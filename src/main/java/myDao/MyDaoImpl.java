package myDao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import myModel.User;

public class MyDaoImpl extends SqlSessionDaoSupport {

	public User getUser(String userId) {
		return (User) getSqlSession().selectOne("myMapper.MyMapper.getUser", userId);
	}
}
