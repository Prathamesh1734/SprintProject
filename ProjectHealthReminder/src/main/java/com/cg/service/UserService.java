package com.cg.service;

import java.util.List;

import com.cg.model.User;

public interface UserService {

	public List<User> findByName(String username);

}
