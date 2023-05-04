package com.agrotech.agro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrotech.agro.pojo.AgroUser;
import com.agrotech.agro.repository.AgroRepository;

@Service
public class AgroService {

	@Autowired
	private AgroRepository repository;
	//sign in
	public Optional<AgroUser> signIn(String username, String password) {
		Optional<AgroUser> user = repository.findByUsernameAndPassword(username,password);
		return user;
	}
	//sign up
	public AgroUser signIn(AgroUser user) {
		AgroUser user2=repository.save(user);
		return user2;
	}
	public void userRemove(int id) {
		repository.deleteById(id);
	}

}
