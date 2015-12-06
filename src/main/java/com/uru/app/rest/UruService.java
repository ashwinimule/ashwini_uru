package com.uru.app.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.uru.app.business.service.IUruBusinessService;
import com.uru.app.model.UruModel;

/**
 * Created Rahul Dev
 */
@Path("/uru")
@Produces(MediaType.APPLICATION_JSON)
public class UruService {

	@Inject
	private IUruBusinessService uruBusinessService;


	@GET
	@Path("/getUserDetails")
	public UruModel	getUsereDetails(@QueryParam("loginName") String loginName) {
		return uruBusinessService.fetchUserDetails(loginName);
	}
	
}
