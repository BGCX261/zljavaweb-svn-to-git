package com.cuit.spring.action;

import java.util.List;
import com.cuit.spring.model.User;
import com.cuit.spring.service.PageService;
import com.cuit.spring.vo.PageInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PageAction extends ActionSupport implements ModelDriven<PageInfo>{

	private List showlayer;
	private PageInfo pageinfo = new PageInfo();
	private PageService pageservice;
	public String  pageUser() throws Exception
	{
		pageinfo.setPageType("User");
		pageinfo.setPageSize(3);
		pageservice.pageInit(pageinfo);
	    if(showlayer==null)
	    {
	    	System.out.println("showlayer is null");
	    }
		showlayer = (List<User>)pageservice.getfirstPage();
		return "pageuser";
	}
	
	public String nextPage() throws Exception
	{
		
		showlayer = pageservice.nextPage();
		if(showlayer == null)
		{
			return "error";
		}
		return "page" + pageinfo.getPageType().toLowerCase();
	}
	
	public String perviousPage() throws Exception
	{
		showlayer = pageservice.previousPage();
		if(showlayer == null)
		{
			return "error";
		}
		return "page" + pageinfo.getPageType().toLowerCase();
	}
	
	public PageInfo getModel() {
		// TODO Auto-generated method stub
		return pageinfo;
	}
	
	
	
	public void setShowlayer(List showlayer) {
		this.showlayer = showlayer;
	}
	public PageInfo getPageinfo() {
		return pageinfo;
	}
	public void setPageinfo(PageInfo pageinfo) {
		this.pageinfo = pageinfo;
	}
	public PageService getPageservice() {
		return pageservice;
	}
	public void setPageservice(PageService pageservice) {
		this.pageservice = pageservice;
	}

	public List getShowlayer() {
		return showlayer;
	}
	
}
