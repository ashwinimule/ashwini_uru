package com.uru.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Rahul Dev
 * 
 */
@Entity
@Table(name = "login")
public class UruEntity extends MasterEntity {
	@Column(name = "login_name", unique = true, nullable = false)
	private String loginName;
	@Column(name = "password", length = 100)
	private String password;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
