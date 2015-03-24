package com.gd.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gd.dao.LoginDAO;
import com.gd.dao.LoginDAOImpl;


public class LoginServiceImpl extends HibernateDaoSupport implements LoginService {

	private LoginDAO logindao;
	
	public void setLogindao(LoginDAOImpl logindao) {
		this.logindao = logindao;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return logindao.login(username, password);
	}
	
	

}
