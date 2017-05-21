package com.ssh.dao.api;

import java.util.List;

import com.ssh.entity.User;

/**     
 * 类名称：UserDao   
 * 类描述：用户控制dao实现数据库操作接口
 * 创建人：anan   
 * 创建时间：2012-12-21 下午11:05:46   
 * 修改人：anan  
 * 修改时间：2012-12-21 下午11:05:46   
 * 修改备注：   
 * @version        
 * */
public interface IUserDao {
	public void addUser(User user);

	public void delUser(String userId);

	public void updateUser(User user);

	public List<User> selectUser();

	public User getUserByUserId(String userId);

	public boolean isExitByName(String userName);

	public boolean isExitByNameAndPass(User user);
}
