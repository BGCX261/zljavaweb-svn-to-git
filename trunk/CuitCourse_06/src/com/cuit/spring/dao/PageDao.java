package com.cuit.spring.dao;

import java.util.List;

public interface PageDao {

	public List findTop(String sql,int top) throws Exception;
	public List findPage(String sql,int firstRow ,int MaxRow) throws Exception;
	public int rowsAccount(String sql) throws Exception;
}
