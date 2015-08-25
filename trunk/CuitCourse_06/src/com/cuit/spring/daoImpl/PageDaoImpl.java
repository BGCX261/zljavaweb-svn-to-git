package com.cuit.spring.daoImpl;

import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.cuit.spring.Util.SuperDaoSupport;
import com.cuit.spring.dao.PageDao;

public class PageDaoImpl extends SuperDaoSupport implements PageDao {

	

	public List findPage(String sql, int firstRow, int MaxRow) throws Exception {
		// TODO Auto-generated method stub
	    Query query = this.getSession().createQuery(sql);
	    query.setFirstResult(firstRow);
	    query.setMaxResults(MaxRow);
		return query.list();
	}

	public List findTop(String sql, int top) throws Exception {
		// TODO Auto-generated method stub
		HibernateTemplate ht = this.getHibernateTemplate();
		ht.setMaxResults(top);
		return ht.find(sql);
	}

	public int rowsAccount(String sql) throws Exception {
		// TODO Auto-generated method stub
		Query query = this.getSession().createQuery("select count(*) "+sql.substring(sql.indexOf("from")));
		Long count = (Long) query.uniqueResult();
		return count.intValue();
	}

}
