package com.cuit.spring.service;

import java.util.List;
import com.cuit.spring.vo.PageInfo;

public interface PageService {

	public void pageInit(PageInfo pageinfo) throws Exception;
	public List nextPage() throws Exception;
	public List previousPage() throws Exception;
	public List getfirstPage() throws Exception;
}
