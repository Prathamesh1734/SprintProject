package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer>{
	public List<User> findByName(String name);
}
