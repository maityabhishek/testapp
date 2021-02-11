package com.testapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapp.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findById(int id);

}
