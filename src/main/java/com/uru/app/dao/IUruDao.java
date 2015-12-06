package com.uru.app.dao;

import com.uru.app.model.UruModel;


/**
 * @author Rahul dev
 * 
 */
public interface IUruDao {
	public UruModel fetchUserDetails(String loginName);
	
}
