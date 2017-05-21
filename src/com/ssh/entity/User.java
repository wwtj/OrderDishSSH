package com.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**     
 * 类名称：User   
 * 类描述：用户信息实体
 * 创建人：anan   
 * 创建时间：2012-12-21 下午10:55:19   
 * 修改人：anan  
 * 修改时间：2012-12-21 下午10:55:19   
 * 修改备注：   
 * @version        
 * */
/**
 * @Entity表示当前类是一个实体
 * @Table(name = "user")指定这个类映射到数据库的哪一个表
 * @Column(name = "userId")表示这个属性映射数据库对应表中的那一列...
 * @author wangtianjiao
 *
 */
@Entity
@Table(name = "user")
public class User {
	/**
	 * 用户id
	 */
	@Id
	@Column(name = "userId")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	
	/**
	 * 用户名
	 */
	@Column(name = "userName", length = 50)
	private String userName;
	
	/**
	 * 用户登录密码
	 */
	@Column(name = "pwd", length = 50)
	private String pwd;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public User(String userId, String userName, String pwd) {
		this.userId = userId;
		this.userName = userName;
		this.pwd = pwd;
	}

	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	public User(String userId) {
		this.userId = userId;
	}

	public User() {
		
	}

}
