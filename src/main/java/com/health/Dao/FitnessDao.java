package com.health.Dao;

import java.util.List;

import com.health.model.LoginTO;

public interface FitnessDao {
	LoginTO authenticate(LoginTO objLoginTO);
	List<LoginTO> getLoginUsers();
	void addLoginUser(LoginTO objLoginTO);
}