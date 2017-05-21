package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.dao.api.IUserDao;
import com.ssh.entity.User;
import com.ssh.service.api.IUserService;


/**     
 * 类名称：UserServiceImpl   
 * 类描述：用户信息操作业务逻辑接口实现
 * 创建人：anan   
 * 创建时间：2012-12-21 下午11:08:18   
 * 修改人：anan  
 * 修改时间：2012-12-21 下午11:08:18   
 * 修改备注：   
 * @version        
 * */
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public boolean isExitUser(String userName) {
		return userDao.isExitByName(userName);
	}

	public void save(User user) {
		userDao.addUser(user);
	}

	public List<User> getUsers() {
		List<User> users = userDao.selectUser();
		return users;
	}

	public void del(String userId) {
		userDao.delUser(userId);

	}

	public void update(User user) {
		userDao.updateUser(user);

	}

	public User getUserById(String userId) {
		return userDao.getUserByUserId(userId);
	}

	public boolean isExitByNameAndPass(User user) {
		return userDao.isExitByNameAndPass(user);
	}

}
