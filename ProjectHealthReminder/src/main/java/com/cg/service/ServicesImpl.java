package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserJpaRepository;
import com.cg.model.User;

@Service
public class ServicesImpl implements DietService, MedicalRecordService, MentalHealthService, UserService{
	@Autowired
	private UserJpaRepository userRepo;

	@Override
	public List<User> findByName(String name) {
		List<User> userList=userRepo.findByName(name);
		return userList;
	}
}
