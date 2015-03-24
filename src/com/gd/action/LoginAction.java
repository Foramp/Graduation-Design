package com.gd.action;

import com.gd.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private LoginService loginservice;
	private String username;
	private String password;
	public LoginService getLoginservice() {
		return loginservice;
	}
	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}
	public String getUsernaem() {
		return username;
	}
	public void setUsernaem(String usernaem) {
		this.username = usernaem;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login(){
		boolean flag = loginservice.login(username, password);
		if(flag){
			return "success";
		}else{
			return "fail";
		}
	}
}
