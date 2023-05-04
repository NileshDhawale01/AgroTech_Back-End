package com.agrotech.agro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agrotech.agro.dto.Login;
import com.agrotech.agro.pojo.AgroUser;
import com.agrotech.agro.service.AgroService;

@RestController
@RequestMapping("/api/v1")
public class AgroController {

	@Autowired
	private AgroService service;
	@GetMapping("/")
	public String testing() {
		return "Hello it's work";
	}
	//sign in
	@PostMapping("/signin")
	public Optional<AgroUser> signIn(@RequestBody Login login) {
		
		Optional<AgroUser> user = service.signIn(login.username,login.password);
		//success
		if(user != null) {
			return user;
		}
		return user;
	}
	//sign up
	@PostMapping("/signup")
	public AgroUser signup(@RequestBody AgroUser user ){
		AgroUser user2 = service.signIn(user);
		//success
		return user2;
	}
	//delete user
	@DeleteMapping("/remove/{id1}")
	public HttpStatus userRemove(@PathVariable String id1) {
		int id = Integer.parseInt(id1);
		service.userRemove(id);
		return HttpStatus.OK;
	}
}
