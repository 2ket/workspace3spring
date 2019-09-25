package com.bit.struts.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class IndexAction implements Action{
	Logger log=Logger.getLogger("com.bit.struts.action.IndexAction");
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		log.debug("indexAction run...");
		return this.SUCCESS;
	}

}
