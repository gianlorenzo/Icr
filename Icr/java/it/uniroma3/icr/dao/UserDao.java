package it.uniroma3.icr.dao;

import it.uniroma3.icr.model.User;

public interface UserDao {
	public void insertUser(User user);
	public User findUser(String username);

}
