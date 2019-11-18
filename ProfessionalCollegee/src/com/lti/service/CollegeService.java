package com.lti.service;

import java.util.List;

import com.lti.dao.CollegeDao;
import com.lti.model.College;

public class CollegeService {

	CollegeDao dao = null;
	public CollegeService(){
		dao = new CollegeDao();
	}
	/*public boolean checkLogin(String username, String password){
		int result = dao.readLogin(username, password);
		if(result ==1)
			return true;
		else
			return false;
	}*/
	public List<College> findAllCollege(){
		return dao.readAllCollege();
	}
	
	public boolean removeCollege(int cid){
		int result = dao.deleteCollege(cid);
		if(result ==1)
			return true;
		else
			return false;
	}
	
	public boolean addCollege(College college){
		int result = dao.createCollege(college);
		if(result == 1)
			return true;
		else
			return false;
	}
	
	/*public boolean updateUser(Users user) {
		int result = dao.updateUser(user);
		if(result ==1)
			return true;
		else
			return false;
	}*/
}

