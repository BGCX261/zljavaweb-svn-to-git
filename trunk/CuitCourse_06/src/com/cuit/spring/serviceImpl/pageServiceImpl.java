package com.cuit.spring.serviceImpl;

import java.util.List;
import com.cuit.spring.dao.PageDao;
import com.cuit.spring.model.Page;
import com.cuit.spring.service.PageService;
import com.cuit.spring.vo.PageInfo;
public class pageServiceImpl implements PageService {

	private PageDao pagedao;
	private Page page=new Page();
	private String sql;
	public PageDao getPagedao() {
		return pagedao;
	}
	public void setPagedao(PageDao pagedao) {
		this.pagedao = pagedao;
	}
	public void pageInit(PageInfo pageinfo) throws Exception {
		// TODO Auto-generated method stub
		sql ="from  " + pageinfo.getPageType();
		page.setPageSize(pageinfo.getPageSize());
		//System.out.println(pagedao.rowsAccount(sql));
		page.setTotalRows(pagedao.rowsAccount(sql));
		page.setPageCount(page.getTotalRows()% page.getPageSize() == 0 ? 
				page.getTotalRows()/page.getPageSize() : page.getTotalRows()/page.getPageSize()+1);
		page.setPageNow(1);
		page.setHasNextPage(page.getPageCount() == page.getPageNow() ? true :false);
		page.setHasPreviousPage(false);
		page.setHasNextPage(page.getPageNow() < page.getPageCount() ? true : false);
		page.setFirstPage(true);
		page.setLastPage(page.isHasNextPage()?false:true);
		page.setBegin(0);
		page.setEnd( page.isHasNextPage()? 
				page.getPageSize(): page.getTotalRows() );
	}
	public List getfirstPage() throws Exception
	{
	
			return pagedao.findTop(sql, page.getPageSize());
		
	}
	public List nextPage() throws Exception
	{
		if(page.isHasNextPage())
		{
			this.refresh("next");
			return pagedao.findPage(sql, page.getBegin(), page.getEnd());
		}
		else
		{
			return null;
		}
	}
	public List previousPage() throws Exception
	{
		if(page.isHasPreviousPage())
		{
			this.refresh("previous");
			return pagedao.findPage(sql, page.getBegin(), page.getEnd());
		}
		else
		{
			return null;
		}
	}
	public String pageSkip()
	{
		
		return "page";
	}
	private  void refresh(String action)
	{
		if(action.equals("previous"))
		{
			page.setPageNow(page.getPageNow()+1);
		}
		else
		{
			page.setPageNow(page.getPageNow()-1);
		}
		page.setBegin(page.getPageNow()*page.getPageSize());
		page.setFirstPage(page.getPageNow()==1?true:false);
		page.setHasNextPage(page.getPageNow() < page.getPageCount() ? true : false);
		page.setHasPreviousPage(page.getPageNow()>1?true:false);
		page.setLastPage(page.getPageCount()== page.getPageNow()?true:false);
		if(page.isFirstPage())
		{
			page.setEnd( page.isHasNextPage()? 
					page.getPageSize(): page.getTotalRows() );
		}else if(page.isLastPage())
		{
			page.setEnd(page.getTotalRows());
		}else
		{
			page.setEnd(page.getBegin()+page.getPageSize());
		}
	}
	private int ensurePageAccount(int pageRows,int pageSize)
	{
		
		if(pageRows % pageSize == 0)
		{
			return pageRows/pageSize;
		}
		else
		{
			return pageRows/pageSize +1;
		}
	}
	
}
