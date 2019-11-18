package com.lti.service;

import com.lti.dao.LoginDao;

public class LoginService {
	LoginDao dao = null;
	public LoginService(){
		dao = new LoginDao();
	}
	public boolean checkLogin(String username, String password){
		int result = dao.readLogin(username, password);
		if(result ==1)
			return true;
		else
			return false;
	}
}
