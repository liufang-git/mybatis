package cn.itcast.dao;

import java.util.List;

import cn.itcast.pojo.User;

public interface UserDao2 {
	
	// 根据id查询用户信息
	public User findUserById(Integer id) throws Exception;
	
	
	// 根据名称查询用户信息
	public List<User> findUserByName(String name) throws Exception;

}
