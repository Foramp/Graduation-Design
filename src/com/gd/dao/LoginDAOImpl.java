package com.gd.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.gd.domain.Users;

public class LoginDAOImpl extends HibernateDaoSupport implements LoginDAO {

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		List<Users> u=this.getHibernateTemplate()
				.find("from users where username=? and password=?",username,password);
		if(u.size()>0){
			return true;
		}
		return false;
	}
	
}
