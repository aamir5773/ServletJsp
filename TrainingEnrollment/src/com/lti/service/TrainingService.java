package com.lti.service;
import com.lti.dao.*;

import java.util.List;

import com.lti.dao.Dao;
import com.lti.model.Training;
import com.lti.model.Training;

public class TrainingService {
	Dao dao = null;
	public TrainingService(){
		dao =  new Dao();
	}
	/*public boolean checkLogin(String username, String password){
		int result = dao.readLogin(trainingid);
		if(result==1){
			return true;
		}
		else
			return false;
	}*/
	
	/*public List<Training> findAllUsers(){
		return dao.readAllUsers();
	}*/
	
	public boolean removeUser(int trainingid){
		int result = dao.deleteUser(trainingid);
		if(result==1)
			return true;
		else
			return false;
	}
}
