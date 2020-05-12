package com.health.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.health.Dao.FitnessDao;
import com.health.model.LoginTO;

@Service
public class FitnessService {
	private FitnessDao objFitnessDao;
	
	@Autowired
	FitnessService(@Qualifier("listDaoImpl")FitnessDao objFitnessDao) {
		this.objFitnessDao = objFitnessDao;
	}
	
	public LoginTO authenticate(LoginTO objLoginTO) {
		return objFitnessDao.authenticate(objLoginTO);
	}
	
	public List<LoginTO> getLoginUsers() {
		return objFitnessDao.getLoginUsers();
	}
	
	public void addLoginUser(LoginTO objLoginTO) {
		objFitnessDao.addLoginUser(objLoginTO);
	}
}