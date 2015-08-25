package o_o;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cuit.spring.dao.PageDao;
import com.cuit.spring.service.PageService;
public class Gg extends TestCase {
	
	public void test() throws Exception
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-beans.xml");
		PageService pagedao = (PageService) ctx.getBean("pageservice");
		System.out.println(pagedao.getTotalRows("from User"));
	}
}





