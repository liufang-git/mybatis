package cn.itcast.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUserById(Integer id) throws Exception {
		// 1. 加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("MyBatisConfig.xml");
		
		// 2. 根据核心配置文件创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		// 3. 根据会话工程创建会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = sqlSession.selectOne("user.selectUserById", id);
		
		// 关闭会话
		sqlSession.close();
		
		return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		// 1. 加载核心配置文件
		InputStream inputStream = Resources.getResourceAsStream("MyBatisConfig.xml");
		
		// 2. 根据核心配置文件创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		// 3. 根据会话工程创建会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		List<User> userList = sqlSession.selectList("user.selectUserByName", "%王%");
		
		// 关闭会话
		sqlSession.close();
		
		return userList;
	}

}
