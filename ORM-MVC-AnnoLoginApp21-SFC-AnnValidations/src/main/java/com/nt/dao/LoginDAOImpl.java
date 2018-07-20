package com.nt.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserHLO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	//private static final String  AUTH_QRY="SELECT COUNT(*) FROM UserHLO WHERE uname=? and pwd=?";
	@Resource
   private HibernateTemplate ht;
	
	@Override
	public int   validate(UserHLO bo) {
   int cnt=0;
	List <?> list=null;
	//execute HQL
	/*list=ht.findByNamedQueryAndNamedParam("AUTH_QRY",
			                                                                                new String[]{"un","pass"},
			                                                                                new String[]{bo.getUname(),bo.getPwd()});
	cnt=(Long)list.get(0);
	
	
		return cnt;*/
	cnt=ht.execute(new HibernateCallback<Integer>() {
		@Override
		public Integer doInHibernate(Session ses) throws HibernateException {
			SQLQuery query=null;
			List<Integer> list=null;
			query=ses.createSQLQuery("select count(*) from userlist where uname=? and pwd=?");
			query.addScalar("count(*)",StandardBasicTypes.INTEGER);
			query.setString(0,bo.getUname());
			query.setString(1,bo.getPwd());
			list=query.list();
			return list.get(0);
		}
	});
	return cnt;
	
	}//validate(-)
}//class
