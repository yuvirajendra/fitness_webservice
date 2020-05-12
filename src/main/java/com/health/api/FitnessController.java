package com.health.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.model.LoginTO;
import com.health.service.FitnessService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FitnessController {
	@Autowired
	private FitnessService objFitnessService;
	
	@PostMapping
	@RequestMapping("/authenticate")
	public LoginTO authenticate(@RequestBody LoginTO login) {	
		System.out.println("Authenticate: " + login.toString());
		return objFitnessService.authenticate(login);
	}
	
	@PostMapping
	@RequestMapping("/signUp")
	public void addLoginUser(@RequestBody LoginTO login) {	
		System.out.println("SignUp: " + login.toString());
		objFitnessService.addLoginUser(login);
	}
	
	@GetMapping
	@RequestMapping("/getLoginUsers")
	public List<LoginTO> getLoginUsers() {	
		System.out.println("Get Login Users");
		return objFitnessService.getLoginUsers();
	}
}