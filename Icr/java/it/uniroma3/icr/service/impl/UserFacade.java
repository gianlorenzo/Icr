package it.uniroma3.icr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.UserDaoImpl;
import it.uniroma3.icr.model.User;

@Service
public class UserFacade {
	@Autowired
	private UserDaoImpl userDaoImpl;
	public void addUser(User user) {
		userDaoImpl.insertUser(user);
	}
	public User retrieveUser(String username) {
		return this.userDaoImpl.findUser(username);
	}
}
