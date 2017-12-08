package cn.itcast.mapper2;

import java.util.List;

import cn.itcast.pojo.User;

public interface UserMapper3 {
	
	// 根据id查询用户信息
	public User findUserById(Integer id) throws Exception;
	
	
	// 根据名称查询用户信息
	public List<User> findUserByName(String name) throws Exception;

}
