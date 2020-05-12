package com.health.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.health.model.LoginTO;

@Repository("listDaoImpl")
public class FitnessDaoImpl implements FitnessDao {
	List<LoginTO> objLoginTO = new ArrayList<LoginTO>();
	
	@Override
	public LoginTO authenticate(LoginTO loginTO) {
		List<LoginTO> returnObj = objLoginTO.stream().filter(login -> login.getUsername().equals(loginTO.getUsername())).collect(Collectors.toList());
		
		System.out.println("Authorized User: " + returnObj.toString());
		return returnObj.get(0);
	}

	@Override
	public List<LoginTO> getLoginUsers() {
		return objLoginTO;
	}

	@Override
	public void addLoginUser(LoginTO loginTO) {
		objLoginTO.add(loginTO);
	}

}
