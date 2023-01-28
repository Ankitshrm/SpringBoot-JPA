package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	@Query("Select u from User u where u.name=:n or u.city=:c")
	public List<User> findByNameOrCity(@Param("n")String name,@Param("c")String city);
}
