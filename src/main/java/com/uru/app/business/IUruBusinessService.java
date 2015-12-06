package com.uru.app.business;

import com.uru.app.model.UruModel;


/**
 * Created by Rahul Dev
 */
public interface IUruBusinessService {

	public UruModel fetchUserDetails(String loginName);
	

}
